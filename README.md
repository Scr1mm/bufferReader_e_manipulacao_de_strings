# BufferReader e Manipulação de Strings

![Java](https://img.shields.io/badge/Java-17+-orange?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/build-Maven-C71A36?logo=apachemaven&logoColor=white)
![Tipo](https://img.shields.io/badge/projeto-estudo-blue)
![Dados](https://img.shields.io/badge/dados-CSV-yellow)

Projeto em Java com 5 desafios que leem um inventário de ativos de rede em um arquivo CSV e o analisam usando `BufferedReader` e manipulação de strings, **somente com a biblioteca padrão** da linguagem.

---

## Sobre o projeto

Cada desafio lê o arquivo `ativos.csv` linha a linha e extrai uma informação diferente, simulando tarefas comuns de inventário de TI e segurança da informação.

| Desafio | Método | O que faz |
|:-------:|--------|-----------|
| **1** | `desafio1()` | Lista o **host** de todos os dispositivos |
| **2** | `desafio2()` | Conta o **total de dispositivos** cadastrados |
| **3** | `desafio3()` | Lista os **hosts** com sistema **Linux** |
| **4** | `desafio4()` | Lista os **IPs** dos dispositivos **Windows** |
| **Final** | `desafioFinal()` | Gera um **relatório** com o total de ativos por sistema (Linux, Windows, Firewall e Outros) |

---

## Conceitos praticados

- Leitura de arquivos com `BufferedReader` e `FileReader`
- Quebra de linhas em campos com `String.split(",")`
- Busca de texto com `String.contains()`
- Estruturas `while` e `if / else if / else`
- Contadores e relatório final
- Métodos estáticos e tratamento de `IOException`

---

## Estrutura do projeto

```text
.
├── README.md
├── saida.txt                      # exemplo de saída do programa
└── demo/
    ├── pom.xml                    # configuração Maven (Java 17)
    └── src/main/java/com/example/
        └── Main.java              # todos os desafios
```

---

## Formato do arquivo `ativos.csv`

O programa procura o arquivo `ativos.csv` na pasta **de onde o comando é executado**. A primeira linha é o cabeçalho e é ignorada. Colunas usadas:

| Posição | Campo | Exemplo |
|:-------:|-------|---------|
| 0 | Host | `SRVWEB001` |
| 1 | IP | `192.168.1.10` |
| 2 | Sistema operacional | `Linux Ubuntu 22.04` |

Exemplo:

```csv
host,ip,sistema
SRVWEB001,192.168.1.10,Linux Ubuntu 22.04
NOTE001,192.168.1.21,Windows 11
FW001,192.168.1.1,Firewall pfSense
```

> O arquivo `ativos.csv` não está incluído no repositório. Crie o seu seguindo o formato acima.

---

## Como executar

**Pré-requisito:** JDK 17 ou superior.

```bash
java -version
```

### Com Maven

```bash
cd demo
mvn compile
java -cp target/classes com.example.Main
```

### Só com o `javac`

```bash
cd demo
javac -d target/classes src/main/java/com/example/Main.java
java -cp target/classes com.example.Main
```

Em ambos os casos, coloque o `ativos.csv` dentro da pasta `demo/`.

---

## Exemplo de saída

Com o CSV de exemplo acima:

```text
===== DESAFIO 1 - HOSTS =====
SRVWEB001
NOTE001
FW001

===== DESAFIO 2 - TOTAL DE DISPOSITIVOS =====
Total de dispositivos: 3

===== DESAFIO 3 - HOSTS LINUX =====
SRVWEB001

===== DESAFIO 4 - IPs WINDOWS =====
192.168.1.21

===== DESAFIO FINAL - RELATÓRIO DE ATIVOS =====
Total de ativos: 3
Linux:    1
Windows:  1
Firewall: 1
Outros:   0
```

Um exemplo com um inventário maior está no arquivo [`saida.txt`](saida.txt).

---

## Objetivo

Projeto com finalidade acadêmica para praticar **leitura de arquivos**, **manipulação de strings** e **lógica de programação** em Java, aplicados a um cenário de inventário de ativos de TI.
