# Gestão de Agendamentos de Salas Corporativas

Sistema de gerenciamento de agendamentos de salas corporativas desenvolvido em Java. Este projeto é um back-end em desenvolvimento contínuo, onde novas funcionalidades e melhorias são implementadas diariamente como parte do processo de aprendizado.

## 📋 Descrição

O sistema permite o gerenciamento de reservas de salas corporativas através de uma interface de linha de comando (CLI). O usuário pode agendar salas, visualizar agendamentos e cancelar reservas, com validações de horários e disponibilidade.

## 🚀 Funcionalidades

- **Agendamento de Salas**: Reserva de salas com validação de horários e datas
- **Visualização de Agendamentos**: Listagem de todos os agendamentos realizados
- **Cancelamento de Agendamentos**: (Em desenvolvimento)
- **Validação de Horários**: Verificação de horários dentro do período de funcionamento
- **Múltiplas Salas**: 10 salas disponíveis com diferentes tipos (Auditório, Sala de Reunião, Sala de Estudos, etc.)
- **Programação Semanal**: Horários de funcionamento diferenciados por dia da semana

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal
- **Java Time API**: Manipulação de datas e horários (`java.time.*`)
- **Scanner**: Interface de linha de comando para interação com o usuário

## 📁 Estrutura do Projeto

```
GestaoSalas/
├── src/
│   ├── application/
│   │   └── Main.java           # Classe principal com menu interativo
│   ├── entities/
│   │   ├── Agendamento.java    # Entidade de agendamento
│   │   └── enums/
│   │       ├── IdSalas.java    # Enum com identificação das salas
│   │       └── ProgramacaoFuncionamento.java # Enum com horários de funcionamento
│   └── service/
│       └── AgendamentoService.java # Serviço com constantes e regras de negócio
```

## 💻 Como Executar

### Pré-requisitos
- Java Development Kit (JDK) 17 ou superior
- IDE compatível (IntelliJ IDEA, Eclipse, etc.) ou compilador Java

### Passos para execução

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
cd GestaoSalas
```

2. Compile o projeto:
```bash
javac src/application/Main.java src/entities/Agendamento.java src/entities/enums/*.java src/service/AgendamentoService.java -d out/
```

3. Execute a aplicação:
```bash
java -cp out/ application.Main
```

Ou utilize sua IDE favorita para abrir e executar o projeto diretamente.

## 📖 Como Usar

Ao executar a aplicação, você verá um menu com as seguintes opções:

1. **Fazer um Agendamento**: 
   - Escolha uma sala entre as 10 disponíveis
   - Selecione o dia da semana (Segunda a Sexta)
   - Defina o horário de início e fim (mínimo 30 minutos)
   - Escolha a data específica dentro do mês

2. **Cancelar um Agendamento**: (Em desenvolvimento)

3. **Verificar um Agendamento**: 
   - Visualize todos os agendamentos realizados com detalhes

4. **Fechar Menu**: Encerra a aplicação

## 🏢 Salas Disponíveis

- Sala 1 - Auditório
- Sala 2 - Auditório
- Sala 3 - Sala de Reunião
- Sala 4 - Sala de Reunião
- Sala 5 - Sala de Estudos
- Sala 6 - Sala de Descanço
- Sala 7 - Sala Executiva
- Sala 8 - Sala Executiva
- Sala 9
- Sala 10

## ⏰ Horários de Funcionamento

- **Segunda**: 08:30 - 16:00
- **Terça**: 08:00 - 18:00
- **Quarta**: 08:00 - 18:00
- **Quinta**: 08:00 - 18:00
- **Sexta**: 08:00 - 16:00

## 🚧 Status do Projeto

Este projeto está em desenvolvimento ativo. Funcionalidades estão sendo adicionadas e melhoradas continuamente.

### Funcionalidades Implementadas
- ✅ Menu interativo
- ✅ Seleção de salas
- ✅ Validação de horários de funcionamento
- ✅ Validação de tempo mínimo de reserva (30 minutos)
- ✅ Seleção de datas e meses
- ✅ Listagem de agendamentos

### Funcionalidades em Desenvolvimento
- 🚧 Cancelamento de agendamentos
- 🚧 Verificação de disponibilidade de salas em horários específicos
- 🚧 Persistência de dados
- 🚧 Validação de conflitos de horário

## 📝 Regras de Negócio

- Tempo mínimo para reserva: 30 minutos
- Agendamentos devem estar dentro do horário de funcionamento do dia escolhido
- Cada agendamento recebe um ID único gerado aleatoriamente
- Apenas dias úteis (Segunda a Sexta) estão disponíveis para agendamento

## 👨‍💻 Desenvolvimento

Este projeto serve como ambiente de aprendizado e prática de conceitos de programação Java, incluindo:
- Programação orientada a objetos
- Enums (enumerações)
- Manipulação de datas e horários
- Collections (List, ArrayList)
- Interface de linha de comando
- Validação de entrada de dados

## 📄 Licença

Este projeto é desenvolvido para fins educacionais.

## 🤝 Contribuições

Este é um projeto pessoal em desenvolvimento. Sugestões e melhorias são bem-vindas através de issues e pull requests.

---

**Desenvolvido por beltraodev**
