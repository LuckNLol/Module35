Feature: WB_tests
  # Позитивный сценарий: Выполнить поиск товара, выполнить сортировку, выбрать самый дорогой товар в списке
  Scenario: Select proper item in separate window
    Given url 'https://www.wildberries.ru/'
    Then website is open start search "крем для рук"
    Then choose price option dropdown 'filter'
    Then select price option 'decrease price'
    Then choose first element 'card'
    And assert that proper article is 'good article'




