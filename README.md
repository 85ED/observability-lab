# Observability Lab (Spring Boot)

Projeto de estudo para treinar **observabilidade em aplicações Spring Boot**.

A ideia desse projeto é aprender, na prática, como funciona:
- métricas
- health check
- tracing
- erros em runtime
- leitura da aplicação via HTTP

Tudo feito passo a passo, sem pular etapas.

---

## Tecnologias usadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Boot Actuator
- Micrometer
- Prometheus (exposição de métricas)
- Zipkin (tracing distribuído)
- Docker (para rodar o Zipkin)

---

## O que já funciona

- Aplicação Spring Boot rodando
- Endpoint de health:
/actuator/health

diff
Copiar código
- Lista de métricas disponíveis:
/actuator/metrics

diff
Copiar código
- Métricas expostas para Prometheus:
/actuator/prometheus

yaml
Copiar código
- Métricas customizadas criadas manualmente
- Endpoint de teste que gera erro proposital para estudo
- Tracing configurado (Zipkin)

---

## Objetivo do projeto

Projeto **apenas para aprendizado**.

Serve para:
- entender como o Spring coleta métricas automaticamente
- entender como criar métricas customizadas
- visualizar tempo de resposta, quantidade de chamadas e erros
- aprender observabilidade sem framework mágico

---

## Observação importante

Esse projeto foi construído **bem devagar**, corrigindo erros no caminho,
para realmente entender o que está acontecendo por trás do Spring.

Não é projeto de produção.
É um laboratório de estudo.

---

## Próximos passos (ideias)

- Integrar Prometheus de verdade
- Criar dashboard no Grafana
- Melhorar logs com traceId
- Simular cenário real de produção
