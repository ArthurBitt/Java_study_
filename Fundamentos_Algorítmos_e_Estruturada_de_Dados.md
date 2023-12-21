# Introdução a algorítmo

- [ ] **sequência lógica de passos - a ordem de execução importa** 
- [ ] **clareza e forma precisa**
- [ ] **criar o algoritmo e avaliar se o resultado obtido é a solução esperada - resultado correto e ordem lógica correta**

``` 
1. Obter a nota do 1º bimestre;
2. Obter a nota do 2º bimestre;
3. Obter a nota do 3º bimestre;
4. Realizar o cálculo da média para cada aluno (maior ou igual a 7 para aprovação);
5. Informar se o aluno foi “aprovado ou reprovado”;
6. Informar a média obtida pelo aluno.
```

- [ ] **Pode ser representado por um fluxograma, ou pseudo-linguagem, ou liguagem natural, ou linguagem de progamação(Artificial)**

![fluxograma](https://www.alura.com.br/artigos/assets/algoritmos-e-logica-de-programacao/representacao-algoritmo-fluxograma.jpg)

```portugol
Algoritmo CalcularMediaAlunos
LER Nota1
    LER Nota2
    LER Nota3
    media = (Nota1+Nota2+Nota3)/3
    SE MEDIA >= 6 ENTÃO
        IMPRIME “Aprovado”
    SENÃO
        IMPRIME “Reprovado”
FIM-SE
IMPRIME o valor da média
Fim-Algoritmo CalcularMediaAlunos
```

# Tipos de algorítmo
- [ ] **Recebem parâmetros de entrada, processam e geram uma saída**
- [ ] **Recebem parâmetros de, processam e não geram uma saída**
- [ ] **Não recebem parâmetros de, processam e geram uma saída**
- [ ] **Não recebem parâmetros de, processam não e geram uma saída**


# Lógica de Programação
- [ ] **Onde aplicamos todos os conceitos de algoritmos**
- [ ] **Por meio de uma linguagem de programação, que é um meio estruturado para passar instruções para a máquina.**

``` c
// Linguagem C#
static void Main(string[] args)
        {
            float nota1; float nota2; float nota3; float media;

            Console.WriteLine("Digite nota 1:");
            nota1 = float.Parse(Console.ReadLine());

            Console.WriteLine("Digite nota 2:");
            nota2 = float.Parse(Console.ReadLine());

            Console.WriteLine("Digite nota 3:");
            nota3 = float.Parse(Console.ReadLine());

            media = (nota1 + nota2 + nota3) / 3;

            if(media>=6)
            {
                Console.WriteLine("APROVADO");
            }
            else
            {
                Console.WriteLine("REPROVADO");
            }

            Console.WriteLine("A média do aluno é: " + media);
        }

```

# Estrutura de Dados

- [ ] **Dado é a menor estrutura na progamação - unidade ou elemento de informação acessados por identificador**
    - Os tipos primitivos de dados são : int, float, text, boolean. (Na maioria das linguagens, as variações derivam desses tipos)
- [ ] **Estrutura de dados é a maneira que o dado está organizado - Tal estrutra varia a depender da maneira que o dado será agregado, utilizado e processado**
- [ ] **Podemos afirmar que um programa é composto de algoritmos e estruturas de dados, que juntos fazem com que o programa funcione como deve.**
- [ ] **Cada uma dessas estruturas possuem métodos próprios para inserir, excluir, ordenar e buscar elementos.**
- [ ] **Estruturas de dados podem ser lineares(arrays) e não lineares(grafos)**
- [ ] **Estruturas de dados podem ser homogêneas(apenas um tipo de elemento - sets) e heterogêneas(vários tipos de elementos - dicionários)**
- [ ] **Estruturas de dados podem ser estáticas(não expandem sua memória) e dinâmicas(expandem sua memória)**

# Tipos de Estruturas

- [ ] **Array**
      - vetor, matriz, ou arranjo - é uma lista ordenada de valores, geralmente, é trabalhado apenas um tipo de dado por array, mas existem linguagens que permitem mais de um tipo de dado, como JavaScript. São quase sempre utilizados para organizar dados do mesmo tipo, tendo a possibilidade de serem bidimensionais(matrizes), a fim de tabelar dados -  suas principais operações são ordenar dados, inserir, remover, buscar.

- [ ] **Pilha**
      - stack, ou pilha, é uma estrutura de dados que proporciona controle do fluxo de entrada de dados. Seguindo o paradigma, LIFO - Last in, first out... a última entrada, é a primeira saída. Pensando em uma pilha vertical de livros, o conceito pode ser abstraido. O último livro colocado, é o primeiro que será retirado. -  suas operações são, exclusivamente, inserir no topo e remover dados do topo.

- [ ] **Fila**
    - queue, ou fila, é uma estrutura semelhante a pilha, mas sua estrutura segue um paradigma denominado FIFO... first in, first out. Quem chega antes, sai antes. Portanto, suas únicas operações também são inserir elemento no final e remover elemento no início.

- [ ] **Deque**
          - Double-ended queue, ou fila de duas pontas, é uma variação da fila que aceita inserção e remoção de elementos tanto do início quanto do final da fila. Inserir e remover no início, inserir e remover no final
      
- [ ] **Fila circular**
- [ ] **Lista ligada**
        - um array possui na maior parte das vezes tamnho fixo, indexação de memória e durante a remoção ou inserção de valores, deslocam os elementos, refatorando os index. Já uma lista ligada, trabalha com ponteiros, isto é, não é sequencial, não possui indexação dos valores, mas ponteiros. Os ponteiros unem os nós(valores), sendo que ao inserir ou remover valores, basta que o ponteiro seja redirecionado, fazendo com que essas operações sejam mais simples na lista ligada. Em contrapartida, a busca sequencial de elementos, é melhor executada em arrays e seus index.
      
- [ ] **Conjunto**
      - set, ou conjunto é uma lista não ordenada que não permite repetição de valores.
- [ ] **Dicionário ou Hashmap**
      - São estruturas que utilizam de um recurso próximo a um ponteiro, chaves:valores. As chves guardam o locus da memória que seus valores estão aramazenados. Próximo a uma estutura de objetos, mas com um mecanismo de busca mais eficiente, dado as referências que denominam as chaves.
- [ ] **Árvore**
      - São estruturas hieráquicas que implementam nós, internos e externos... onde os nós internos possuem filhos a esquerda e a direit,enquanto os nós externos ou folhas finalizam a estrutura. Essa organização viabilzia a BST, binary search tree, onde os valores menores sãos os filhos a esquerda e os valores maiores são os filhos da direita. Essa união do algorítmo, otimiza a manipulação dos dados, seja para buscar, inserir, excluir, alterar...
- [ ] **Heap binário**
- [ ] **Grafo**






      




