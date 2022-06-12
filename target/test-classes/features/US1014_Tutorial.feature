Feature: US1014 kullanici ilgili adrese gider

  @tuto
  Scenario: TC19 tutorialsninja dan alisverisini yapar
    Given kullanici "tutoUrl" anasayfasinda
    And click on Phones & PDAs tiklar
    And get the brandName of phones
    And click on add to button for all elements
    And click on black total added cart button
    Then get the names of list from the cart
    Then compare the names from displaying list and cart lis
    And #sayfayi kapatir
