Feature: EPAM site testing

  Scenario: EPAM domain is working
    Given we have browser installed
    When we go to "https://www.epam.com/"
    Then EPAM load site for us

  Scenario:  Contact Us button working
    Given we are at "https://www.epam.com/"
    When we push "Contact us" button
    Then button readdress us to "https://www.epam.com/about/who-we-are/contact"

  Scenario: Admin page is not accessible
    Given we are not admin
    When we go to "https://www.epam.com/admin"
    Then site will show that page not found

  Scenario: Site is resizeable
    Given we have laptop and we are at "https://www.epam.com/" in fullscreen
    When we shrink browser twice
    Then site will show us pictures twice shrunk

  Scenario: Menu button appear if window of browser is small
    Given we have laptop and we are at "https://www.epam.com/" in fullscreen
    When we shrink browser when header is not suitable
    Then "MENU" button appears instead of all buttons

  Scenario: We have access to main page from any page
    Given go to "https://www.epam.com/admin" (not existed page)
    When we press icon "<EPAM>" in the upper left corner
    Then we are readdressed to main page

  Scenario: Any page contains footer at the end
    Given go to "https://www.epam.com"
    When we scroll to the end of page
    Then footer appears at the end of page

  Scenario Outline: Main page have localization
    Given go to "https://www.epam.com"
    When we press "Global (EN)", then "{language}"
    Then site show us full page localized to "{language}"
    Examples:
      |          language          |
      |    Україна (Українська)    |
      |    Polska (Polski)         |
      |    Hungary (English)       |