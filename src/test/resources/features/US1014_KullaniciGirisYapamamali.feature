Feature: US1014 kullanici giris yapamamali

  @auto1
  Scenario: TC19 kullanici yanlis email adresi ile giris yapamamali

    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And email kutusuna @ isareti olmayan email adresi yazar ve enter;a tiklar
    Then error mesajinin "Invalid email address" oldugunu dogrulayin
    And sayfayi kapatir