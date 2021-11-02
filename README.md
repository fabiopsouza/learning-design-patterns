# Design Patterns

**Definição:** Soluções comuns para problemas recorrentes ao utilizar orientação a objetos
**Base:** Livro Design Patterns - Elements of Reusable Object-Oriented Software

## Categorias

- **Criacionais:** Criação dos objetos
- **Estruturais:** Estrutura e composição das classes
- **Comportamentais:** Métodos, estado e interação entre objetos

## Patterns

- **Strategy:** Usado para evitar if-else / switch-case quando tem várias regras para executar que variam de acordo com um parâmetro
  - Exemplo: [CalculadoraDeImpostos.calcular();](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/imposto/CalculadoraDeImpostos.java)
- **Chain of Responsability (Fluxo de Responsabilidades):** Usado quando precisa executar diferentes processamentos de acordo com determinadas regras, mas ao contrário do Strategy, não se sabe a regra de cara pelo parâmetro. A regra deve ser verificada para cada processamento o que inviabiliza o strategy, pois, para passar o tipo como parâmetro (necessário no strategy), teria que fazer o "if-else" de qualquer jeito, só que antes de chamar.
  - Exemplo: [CalculadoraDeDescontos.calcular();](https://github.com/fabiopsouza/learning-design-patterns/blob/main/loja/src/br/com/loja/alura/desconto/CalculadoraDeDescontos.java)
- **Template Method:**
- **State:**
- **Command:**
- **Observer:**
