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
- [ ] **Estrutura de dados é a maneira que o dado está organizado - Tal estrutra varia a depender da maneira que o dado será agregado, utilizado e processado**
- [ ] **Podemos afirmar que um programa é composto de algoritmos e estruturas de dados, que juntos fazem com que o programa funcione como deve.**
- [ ] **Cada uma dessas estruturas possuem métodos próprios para inserir, excluir, ordenar e buscar elementos.**
- [ ] **Estruturas de dados podem ser lineares(arrays) e não lineares(grafos)**
- [ ] **Estruturas de dados podem ser homogêneas(apenas um tipo de elemento - sets) e heterogêneas(vários tipos de elementos - dicionários)**
- [ ] **Estruturas de dados podem ser estáticas(não expandem sua memória) e dinâmicas(expandem sua memória)**

# Tipos de Estruturas




