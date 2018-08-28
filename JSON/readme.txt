create_issue.json:
    - fields:
        - project:
            - key: Chave do Projeto. (Ex."TES") *Obrigatório
        - summary: Sumário, título do card. (Ex.Cliente - IT01 - Projeto)
        - issuetype: Tipo da Issue. *Obrigatório
            - name: (Ex.Task,Subtask,Problem)
        - labels: Etiquetas. *Obrigatório
        - timetracking:
            - originalEstimate: Estimativa de Tempo
            - remainingEstimate: Tempo Restante
        - duedate: Data para ficar pronto.
        - customfield_10033: Cliente
            - value: (Ex.ANA,ANEEL,BRB,CAIXA SEGUROS,CAPES,CNPQ,DATASUS,IPHAN,MCTIC,MJ,MPOG,POOL AUTOMAÇÃO,RFB - Os nomes devem estar em caixa alta)
        - customfield_10056: Complexidade.
            - value: (Ex."Muito Baixa", "Baixa", "Média", "Alta", "Muito Alta")
        -customfield_10039: (Ex.AAAA-MM-DD) Data de Início.

************************************************************************************************

update_issue.json:
    - update:
        - summary:
            - set: Sumário, título do card. (Ex.Cliente - IT01 - Projeto)
        - timetracking:
            - edit:
                - originalEstimate: Estimativa de Tempo
                - remainingEstimate: Tempo Restante
        - labels: 
            - add: Adicionar novas etiquetas.
            - remove: Remover etiqueta existente.
        - fields:
             - customfield_10033: Cliente
            - value: (Ex.ANA,ANEEL,BRB,CAIXA SEGUROS,CAPES,CNPQ,DATASUS,IPHAN,MCTIC,MJ,MPOG,POOL AUTOMAÇÃO,RFB - Os nomes devem estar em caixa alta)
        - customfield_10056: Complexidade.
            - value: (Ex."Muito Baixa", "Baixa", "Média", "Alta", "Muito Alta")
        -customfield_10039: (Ex.AAAA-MM-DD) Data de Início.
        - duedate: Data para ficar pronto.

************************************************************************************************

create_project.json:
    - key: Nova chave do Projeto. *Obrigatório
    - name: Nome do Projeto. 
    - projectTypeKey: Tipo do projeto. (Ex.software, service_desk, business)
    - projectTemplateKey: Template do projeto (Ex.com.pyxis.greenhopper.jira:gh-simplified-agility,         com.pyxis.greenhopper.jira:gh-simplified-basic, com.pyxis.greenhopper.jira:gh-simplified-kanban, com.pyxis.greenhopper.jira:gh-simplified-scrum, com.atlassian.servicedesk:simplified-it-service-desk, com.atlassian.servicedesk:simplified-internal-service-desk, com.atlassian.servicedesk:simplified-external-service-desk, com.atlassian.jira-core-project-templates:jira-core-simplified-content-management, com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval, com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking, com.atlassian.jira-core-project-templates:jira-core-simplified-process-control, com.atlassian.jira-core-project-templates:jira-core-simplified-procurement, com.atlassian.jira-core-project-templates:jira-core-simplified-project-management, com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment, com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking)
    - description: Descrição do projeto.
    - leadAccountId: Id de quem está criando o projeto.
    - url: Criar uma url para o projeto.
    - assigneeType: O responsável padrão ao criar issues para este projeto.

************************************************************************************************

update_project.json:
    - key: Nova chave do Projeto.
    - name: Nome do Projeto.
    - projectTypeKey: Tipo do projeto. (Ex.software, service_desk, business)
    - projectTemplateKey: Template do projeto (Ex.com.pyxis.greenhopper.jira:gh-simplified-agility,         com.pyxis.greenhopper.jira:gh-simplified-basic, com.pyxis.greenhopper.jira:gh-simplified-kanban, com.pyxis.greenhopper.jira:gh-simplified-scrum, com.atlassian.servicedesk:simplified-it-service-desk, com.atlassian.servicedesk:simplified-internal-service-desk, com.atlassian.servicedesk:simplified-external-service-desk, com.atlassian.jira-core-project-templates:jira-core-simplified-content-management, com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval, com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking, com.atlassian.jira-core-project-templates:jira-core-simplified-process-control, com.atlassian.jira-core-project-templates:jira-core-simplified-procurement, com.atlassian.jira-core-project-templates:jira-core-simplified-project-management, com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment, com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking)
    - description: Descrição do projeto.
    - leadAccountId: Id de quem está criando o projeto.
    - url: Criar uma url para o projeto.
    - assigneeType: O responsável padrão ao criar issues para este projeto.
