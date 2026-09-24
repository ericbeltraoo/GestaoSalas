# Gestão de Agendamentos de Salas Corporativas

Sistema de gerenciamento de agendamentos de salas corporativas desenvolvido em Java. Este é um projeto back-end completo com funcionalidades de agendamento, cancelamento e consulta de reservas, incluindo validação de conflitos de horário e relatórios de utilização de salas.

## 📋 Descrição

O sistema permite o gerenciamento de reservas de salas corporativas através de uma interface de linha de comando (CLI). O usuário pode agendar salas, visualizar agendamentos e cancelar reservas, com validações de horários e disponibilidade.

## 🚀 Funcionalidades

- **Agendamento de Salas**: Reserva de salas com validação de horários, datas e conflitos
- **Cancelamento de Agendamentos**: Cancelamento de reservas com confirmação do usuário
- **Verificação de Agendamento Específico**: Busca de agendamento por ID
- **Listagem de Todos os Agendamentos**: Visualização completa de todas as reservas
- **Relatório de Utilização por Sala**: Cálculo do tempo total de uso de uma sala específica
- **Validação de Horários**: Verificação de horários dentro do período de funcionamento
- **Validação de Conflitos**: Impede agendamentos sobrepostos na mesma sala
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
   - O sistema valida automaticamente conflitos com agendamentos existentes

2. **Cancelar um Agendamento**: 
   - Digite o ID do agendamento
   - Confirme o cancelamento após visualizar os detalhes

3. **Verificar um Agendamento**: 
   - Digite o ID do agendamento para visualizar detalhes específicos

4. **Verificar todos os Agendamentos**: 
   - Visualize todos os agendamentos realizados com detalhes

5. **Verificar a duração de todos os agendamentos de uma Sala**: 
   - Escolha uma sala específica
   - Visualize o tempo total de utilização em minutos

6. **Fechar Menu**: Encerra a aplicação

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

Este projeto está em fase de revisão final, com todas as funcionalidades principais implementadas e funcionando.

### Funcionalidades Implementadas
- ✅ Menu interativo com 6 opções
- ✅ Seleção de salas (10 salas disponíveis)
- ✅ Validação de horários de funcionamento
- ✅ Validação de tempo mínimo de reserva (30 minutos)
- ✅ Seleção de datas e meses dinâmicos
- ✅ Cancelamento de agendamentos com confirmação
- ✅ Verificação de agendamento específico por ID
- ✅ Listagem completa de agendamentos
- ✅ Validação de conflitos de horário
- ✅ Relatório de utilização por sala
- ✅ Funções auxiliares (verificação de preenchimento, listagem de salas)

### Próximas Melhorias (Futuras)
- 📋 Persistência de dados (banco de dados ou arquivos)
- 📋 Interface gráfica (GUI)
- 📋 Autenticação de usuários
- 📋 Relatórios mais detalhados

## 📝 Regras de Negócio

- Tempo mínimo para reserva: 30 minutos
- Agendamentos devem estar dentro do horário de funcionamento do dia escolhido
- Cada agendamento recebe um ID único gerado aleatoriamente
- Apenas dias úteis (Segunda a Sexta) estão disponíveis para agendamento
- Não é permitido agendar a mesma sala em horários sobrepostos
- O sistema valida automaticamente conflitos antes de confirmar a reserva

## 👨‍💻 Desenvolvimento

Este projeto serve como ambiente de aprendizado e prática de conceitos de programação Java, incluindo:
- Programação orientada a objetos
- Enums (enumerações)
- Manipulação de datas e horários com Java Time API
- Collections (List, ArrayList)
- Interface de linha de comando (CLI)
- Validação de entrada de dados
- Lógica de negócio em camadas (Service Layer)
- Algoritmos de verificação de conflitos

## 📄 Licença

Este projeto é desenvolvido para fins educacionais.

## 🤝 Contribuições

Este é um projeto pessoal em desenvolvimento. Sugestões e melhorias são bem-vindas através de issues e pull requests.

---

**Desenvolvido por beltraodev**
