Feature: Test Douban API
@TestngScenario
  Scenario: Book API V2
    Given  book id
    When   request book api with book id 1220562
    Then   get the book information