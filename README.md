# Observability Lab (Spring Boot)

Projeto simples de estudo para treinar **observabilidade com Spring Boot**.

A ideia é entender, na prática, como a aplicação pode ser observada enquanto está rodando,
usando métricas, health check e tracing via HTTP.

---

## Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Boot Actuator
- Micrometer
- Prometheus (exposição de métricas)
- Zipkin (tracing)
- Docker

---

## O que funciona hoje

- Aplicação Spring Boot rodando
- Health check via:
  - `/actuator/health`
- Lista de métricas:
  - `/actuator/metrics`
- Métricas para Prometheus:
  - `/actuator/prometheus`
- Métricas customizadas criadas manualmente
- Endpoint de teste que gera erro proposital
- Tracing configurado com Zipkin

---

## Objetivo

Projeto **somente para aprendizado**.

Serve para:
- entender métricas automáticas do Spring
- criar métricas customizadas
- observar tempo de resposta, quantidade de chamadas e erros
- aprender observabilidade sem pular etapas

---

## Observação

Projeto feito passo a passo, corrigindo erros no caminho,
para realmente entender o funcionamento interno do Spring.

Não é projeto de produção.
É um laboratório de estudo.

---

## Próximos passos

- Integrar Prometheus de verdade
- Criar dashboards no Grafana
- Melhorar logs com traceId
- Simular cenários reais de produção
