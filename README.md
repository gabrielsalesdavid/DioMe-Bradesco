# DioMe Bradesco - BootCamp Java

![Badge Java](https://img.shields.io/badge/Java-20-orange?style=flat-square&logo=java)
![Badge Maven](https://img.shields.io/badge/Maven-3.13.0-C71A36?style=flat-square&logo=maven)
![Badge Lombok](https://img.shields.io/badge/Lombok-1.18.30-blue?style=flat-square)

Repositório educacional contendo projetos e exercícios práticos de **Java** do BootCamp DioMe em parceria com **Bradesco**. O projeto abrange conceitos fundamentais de programação Java, estruturas de dados, padrões de design e boas práticas de codificação.

---

## 📋 Índice

- [Visão Geral](#visão-geral)
- [Requisitos do Sistema](#requisitos-do-sistema)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Módulos e Conteúdos](#módulos-e-conteúdos)
- [Como Executar](#como-executar)
- [Atualizações e Melhorias](#atualizações-e-melhorias)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contato](#contato)

---

## 🎯 Visão Geral

Este repositório contém uma coleção completa de estudos e projetos desenvolvidos durante o BootCamp Java do Bradesco na plataforma DioMe. Inclui:

- ✅ **Conceitos Fundamentais**: Tipos de variáveis, operadores, estruturas condicionais e de repetição
- ✅ **Programação Orientada a Objetos**: Classes, métodos, herança e polimorfismo
- ✅ **Estruturas de Dados**: Listas, Sets, Maps e suas operações
- ✅ **Tratamento de Exceções**: Try-catch, exceções customizadas e pilha de debugging
- ✅ **Boas Práticas**: Uso de Lombok para reduzir boilerplate, padrões de design
- ✅ **Exercícios Práticos**: Implementações hands-on de conceitos aprendidos

---

## 🖥️ Requisitos do Sistema

### Mínimo
- **Java Development Kit (JDK)**: Versão 20 ou superior
- **Maven**: Versão 3.13.0 ou superior
- **Sistema Operacional**: Windows, Linux ou macOS

### Recomendado
- **IDE**: IntelliJ IDEA, Eclipse ou VS Code com extensões Java
- **Git**: Para controle de versão

### Instalação de Dependências

```bash
# Instalar Maven (se não estiver instalado)
# Windows: Baixe de https://maven.apache.org/download.cgi
# Linux/macOS: brew install maven (com Homebrew)

# Configurar variáveis de ambiente
set JAVA_HOME=C:\Program Files\Java\jdk-20  # Windows
export JAVA_HOME=/path/to/jdk-20            # Linux/macOS
```

---

## 📁 Estrutura do Projeto

```
DioMe-Bradesco/
├── src/
│   ├── main/java/com/
│   │   ├── estruturacondicional/
│   │   │   └── bradesco/
│   │   │       ├── CondicaoTernaria.java
│   │   │       ├── ControleComposto.java
│   │   │       ├── ControleEncadeada.java
│   │   │       ├── ControleSimples.java
│   │   │       └── SwitchCase.java
│   │   ├── estruturarepeticao/
│   │   │   └── bradesco/
│   │   │       ├── BreakContinue.java
│   │   │       ├── Enquanto.java
│   │   │       ├── FacaEnquanto.java
│   │   │       ├── Para.java
│   │   │       └── ParaColecao.java
│   │   ├── estruturasexceptions/
│   │   │   ├── Aula01.java
│   │   │   ├── Aula02.java
│   │   │   ├── CepInvalidException.java
│   │   │   └── FormatCepExemp.java
│   │   ├── exercicio/
│   │   │   └── bradesco/
│   │   │       ├── Exerc01.java
│   │   │       ├── Exerc02.java
│   │   │       └── Exerc03.java
│   │   ├── intrducaoclass/
│   │   │   └── bradesco/
│   │   │       ├── BoletimEstudantil.java
│   │   │       └── Main.java
│   │   ├── methods/
│   │   │   └── bradesco/
│   │   │       ├── Aula01.java
│   │   │       └── SmarTv.java
│   │   ├── operador/
│   │   │   └── bradesco/
│   │   │       └── Operador.java
│   │   ├── pacotes/
│   │   │   └── bradesco/
│   │   │       └── lanchonete/
│   │   │           └── Cozinheiro.java
│   │   ├── project/
│   │   │   ├── Main.java
│   │   │   ├── comparableXcomparator/
│   │   │   ├── generics/
│   │   │   ├── list/
│   │   │   │   ├── operacoesbasicas/
│   │   │   │   ├── ordenacao/
│   │   │   │   └── pesquisa/
│   │   │   │       └── Livro.java
│   │   │   ├── map/
│   │   │   └── set/
│   │   │       ├── operacoesbasicas/
│   │   │       ├── ordencao/
│   │   │       └── pesquisa/
│   │   │           └── ListaTarefas.java
│   │   ├── terminalargs/
│   │   │   └── bradesco/
│   │   └── tipovariavel/
│   │       └── bradesco/
│   │           └── VarType.java
│   └── test/java/
├── Docs/
│   ├── Conceitos/
│   └── Fundamentos/
├── target/                    # Arquivos compilados (gerado automaticamente)
├── pom.xml                    # Configuração Maven
├── baseline.bat              # Script de testes baseline (Windows)
├── baseline.ps1              # Script de testes baseline (PowerShell)
└── README.md                 # Este arquivo
```

---

## 📚 Módulos e Conteúdos

### 1️⃣ Estruturas Condicionais (`estruturacondicional/`)
Implementação de decisões lógicas em Java

| Arquivo | Descrição |
|---------|-----------|
| `CondicaoTernaria.java` | Operador ternário (condição ? valor1 : valor2) |
| `ControleSimples.java` | Estrutura if/else simples |
| `ControleComposto.java` | Múltiplas condições com if/else if/else |
| `ControleEncadeada.java` | Condições aninhadas |
| `SwitchCase.java` | Estrutura switch/case para múltiplas opções |

### 2️⃣ Estruturas de Repetição (`estruturarepeticao/`)
Loops e iterações

| Arquivo | Descrição |
|---------|-----------|
| `Para.java` | Loop for tradicional |
| `ParaColecao.java` | Enhanced for (for-each) |
| `Enquanto.java` | Loop while |
| `FacaEnquanto.java` | Loop do-while |
| `BreakContinue.java` | Controle de fluxo (break/continue) |

### 3️⃣ Tratamento de Exceções (`estruturasexceptions/`)
Gerenciamento de erros e exceções

| Arquivo | Descrição |
|---------|-----------|
| `Aula01.java` | Fundamentos de try-catch |
| `Aula02.java` | Múltiplos catch e finally |
| `CepInvalidException.java` | Exceção customizada para CEP inválido |
| `FormatCepExemp.java` | Exemplo de formatação e validação de CEP |

### 4️⃣ Exercícios Práticos (`exercicio/`)
Aplicações práticas dos conceitos

| Arquivo | Descrição |
|---------|-----------|
| `Exerc01.java` | Exercício 1 |
| `Exerc02.java` | Exercício 2 |
| `Exerc03.java` | Cálculo de saldos com loops |

### 5️⃣ Introdução a Classes (`intrducaoclass/`)
Conceitos OOP básicos

| Arquivo | Descrição |
|---------|-----------|
| `Main.java` | Classe com método para concatenar nomes |
| `BoletimEstudantil.java` | Modelo de boletim de estudante |

### 6️⃣ Métodos (`methods/`)
Implementação e uso de métodos

| Arquivo | Descrição |
|---------|-----------|
| `Aula01.java` | Aula sobre definição de métodos |
| `SmarTv.java` | Simulação de TV inteligente com métodos de controle |

### 7️⃣ Operadores (`operador/`)
Operadores aritméticos, lógicos e de comparação

| Arquivo | Descrição |
|---------|-----------|
| `Operador.java` | Exemplos de operadores em Java |

### 8️⃣ Pacotes (`pacotes/`)
Organização de código em pacotes

| Arquivo | Descrição |
|---------|-----------|
| `Cozinheiro.java` | Classe exemplo para estruturação em pacotes |

### 9️⃣ Estruturas de Dados (`project/`)
Coleções e generics avançados

#### List
- `operacoesbasicas/` - Adicionar, remover, acessar elementos
- `ordenacao/` - Ordenação de listas (Comparable/Comparator)
- `pesquisa/` - Busca em listas
  - `Livro.java` - Modelo de livro com Lombok @ToString(callSuper = true)

#### Set
- `operacoesbasicas/` - Operações básicas com Sets
- `ordencao/` - Ordenação de Sets
- `pesquisa/` - Busca em Sets
  - `ListaTarefas.java` - Gerenciamento de tarefas

#### Map
- Operações com Maps

#### Generics
- Exemplos de tipos genéricos

#### Comparable vs Comparator
- Interfaces para ordenação

### 🔟 Tipos de Variáveis (`tipovariavel/`)
Primitivos e referência

| Arquivo | Descrição |
|---------|-----------|
| `VarType.java` | Demonstração de tipos primitivos e referências |

### 1️⃣1️⃣ Argumentos de Terminal (`terminalargs/`)
Recebimento de argumentos via linha de comando

---

## 🚀 Como Executar

### Compilar o Projeto
```bash
# Navegue até o diretório do projeto
cd "C:\Users\Gabriel Sales David\Documents\Estudos\Cursos\Tecnologia\Dio.me\BootCamp\Java\Bradesco\DioMe-Bradesco"

# Compilar com Maven
mvn clean compile
```

### Executar Testes
```bash
# Executar todos os testes
mvn test

# Windows - Script Baseline (com Java 20)
baseline.bat

# PowerShell - Script Baseline
.\baseline.ps1
```

### Executar uma Classe Específica
```bash
# Exemplo: Executar a classe Main
mvn exec:java -Dexec.mainClass="com.intrducaoclass.bradesco.Main"

# Exemplo: Classe de operadores
mvn exec:java -Dexec.mainClass="com.operador.bradesco.Operador"
```

### Limpar Build
```bash
mvn clean
```

---

## 📝 Atualizações e Melhorias

### Última Atualização: 1 de Maio de 2026

#### ✨ Novas Alterações
1. **Atualização de Dependências**
   - Corrigido dependency de Lombok: `org.projectlombok:lombok:1.18.30`
   - Escopo definido como `provided` para melhor gerenciamento

2. **Configuração Maven Melhorada**
   - Plugin `maven-compiler-plugin` versão 3.13.0 adicionado
   - Source e target Java 20 configurados explicitamente na build

3. **Scripts de Baseline**
   - `baseline.bat` (Windows) - Setup e teste com Java 20
   - `baseline.ps1` (PowerShell) - Alternativa para PowerShell
   - Validação automatizada de compilação e testes

4. **Correções de Código**
   - `Livro.java` - Corrigido: `@ToString(callSuper = true)` (estava `CallSuper`)
   - `ListaTarefas.java` - Adicionado ponto-e-vírgula faltante na importação Lombok

5. **Novos Arquivos**
   - `Exerc03.java` - Exercício de cálculo de saldos com loops
   - `Cozinheiro.java` - Classe exemplo para pacotes

#### 📊 Estatísticas do Projeto
- **Total de Pacotes**: 11 principal + sub-pacotes
- **Total de Classes**: 30+ classes Java
- **Dependências**: 1 (Lombok)
- **Versão Java**: 20
- **Build Tool**: Maven 3.13.0

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Propósito |
|-----------|--------|----------|
| **Java** | 20 | Linguagem principal |
| **Maven** | 3.13.0 | Gerenciamento de dependências e build |
| **Lombok** | 1.18.30 | Redução de boilerplate (getters, setters, constructors) |
| **JUnit** | (implícito) | Testes unitários |

### Anotações Lombok Utilizadas
- `@Getter` - Gera getters automaticamente
- `@AllArgsConstructor` - Cria constructor com todos os campos
- `@NoArgsConstructor` - Cria constructor vazio
- `@ToString(callSuper = true)` - Gera método toString

---

## 📖 Conceitos-Chave Abordados

### OOP (Programação Orientada a Objetos)
- Encapsulamento
- Herança
- Polimorfismo
- Abstração

### Estruturas de Dados
- **Collections Framework**: List, Set, Map
- **Operações**: Busca, Ordenação, Inserção, Remoção
- **Comparables e Comparators**: Ordenação customizada

### Tratamento de Erros
- Try-catch-finally
- Exceções checked e unchecked
- Exceções customizadas

### Padrões de Design
- Comparable e Comparator
- Generics

---

## 🎓 Estrutura de Aprendizado

O projeto segue uma progressão lógica:

1. **Fundamentos** → Tipos, operadores, estruturas de controle
2. **OOP Básico** → Classes, métodos, encapsulamento
3. **OOP Avançado** → Herança, polimorfismo, interfaces
4. **Collections** → Listas, Sets, Maps
5. **Boas Práticas** → Tratamento de exceções, padrões, Lombok

---

## 🐛 Troubleshooting

### Problema: "JAVA_HOME não configurado"
**Solução**: Defina a variável de ambiente JAVA_HOME para o caminho do JDK 20

```bash
# Windows
setx JAVA_HOME "C:\Program Files\Java\jdk-20"

# Linux/macOS
export JAVA_HOME=/path/to/jdk-20
```

### Problema: "Maven não reconhecido"
**Solução**: Adicione o diretório `bin` do Maven ao PATH

### Problema: "Erro de compilação com Lombok"
**Solução**: Certifique-se de que sua IDE suporta Lombok ou instale o plugin

---

## 📞 Contato

- **Autor**: Gabriel Sales David
- **Plataforma**: DioMe
- **BootCamp**: Bradesco Java
- **Data de Início**: Estudos em 2026

---

## 📄 Licença

Este projeto é fornecido para fins educacionais como parte do BootCamp DioMe Bradesco.

---

## 🔗 Recursos Úteis

- [Documentação Java 20](https://docs.oracle.com/en/java/javase/20/)
- [Maven Official Site](https://maven.apache.org/)
- [Lombok Documentation](https://projectlombok.org/)
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)

---

**Última Atualização**: 1 de maio de 2026 | **Status**: ✅ Ativo e em desenvolvimento
