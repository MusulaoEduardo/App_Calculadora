# Aplicativo de Calculadora em Kotlin

Este é um projeto simples que visa desenvolver um aplicativo de calculadora básico em Kotlin.

## Desenvolvimento no Android Studio

Este README destina-se a auxiliar aqueles que enfrentam dificuldades ao criar um aplicativo de calculadora em diferentes versões do Android Studio. O tutorial original foi baseado na versão 4.0, mas este projeto foi adaptado para a versão mais recente, 2023.1.1, do Android Studio.

### Vídeo Tutorial de Referência

O projeto foi inspirado em um tutorial do canal Stack mobile, disponível [AQUI](https://www.youtube.com/watch?v=Q8X20lCJbd4&list=PLizN3WA8HR1x4KLD4VP18ulM6iE0wVbTX&pp=iAQB). Recomenda-se assistir ao tutorial para uma compreensão abrangente do desenvolvimento do aplicativo de calculadora.

[Playlist - CRIANDO UM APP DE CALCULADORA](https://www.youtube.com/watch?v=Q8X20lCJbd4&list=PLizN3WA8HR1x4KLD4VP18ulM6iE0wVbTX&pp=iAQB)

[Android Studio - Como Usar o ViewBinding (Java e Kotlin) - Guia Absolutamente Completo](https://www.youtube.com/watch?v=RwXJY_k2Kv4&t=300s)

**Versão do Android Studio Utilizada no Vídeo:** Android Studio 4.0

## Problemas Conhecidos

Ao utilizar uma versão mais recente do Android Studio, alguns usuários podem encontrar problemas específicos. Abaixo estão alguns problemas conhecidos e suas soluções:

### Problema 1: Erro com `supportActionBar!!.hide()`

Ao compilar com esta função, ocorria um erro específico:

`FATAL EXCEPTION: main Process: com.example.calculadora_kotlin, PID: 32652`

Para resolver, a função foi removida do projeto: `/*supportActionBar!!.hide()`

### Problema 2: Erro com a biblioteca `net.objecthunter:exp4j:0.4.8`

A importação dessa biblioteca não era reconhecida, mesmo após a sincronização do projeto.

### Problema 3: Dificuldades ao Recuperar `@+id` na `activity_main.xml`

Para solucionar, foi necessário utilizar o ViewBinding.

## Dicas para o Android Studio

Se você está enfrentando problemas ao conectar e depurar no Android Studio, siga estas etapas:

1. **Habilitar a Depuração USB:**
   - Certifique-se de que a depuração USB está ativada no seu dispositivo nas configurações de desenvolvedor.

2. **Conectar o Dispositivo:**
   - Verifique se o dispositivo está corretamente conectado ao computador via USB.

3. **Selecionar Dispositivo de Destino:**
   - No Android Studio, assegure-se de que o dispositivo conectado está selecionado como o dispositivo de destino na barra de ferramentas.

4. **Reiniciar Dispositivo e Android Studio:**
   - Reiniciar o dispositivo e o Android Studio pode resolver problemas temporários.

5. **Verificar Configurações do AndroidManifest.xml:**
   - Verifique se as permissões necessárias estão corretamente declaradas no arquivo AndroidManifest.xml e se não há conflitos.

6. **Verificar Logs no Logcat:**
   - Abra a janela Logcat no Android Studio e examine os logs para mensagens de erro específicas.

7. **Limpar e Rebuild:**
   - Em "Build" no menu superior, escolha "Clean Project" seguido de "Rebuild Project" para limpar artefatos de construção antigos.

8. **Verificar Dependências e Plugins:**
   - Certifique-se de que todas as dependências do seu projeto estão atualizadas e que os plugins do Android Studio estão na versão mais recente.

9. **Atualizar SDK e Build Tools:**
   - Garanta que o SDK do Android e as Build Tools estejam atualizados para a versão mais recente.

10. **Espaço em Disco:**
    - Certifique-se de que há espaço em disco suficiente no seu computador e no dispositivo.

11. **Atualizar Driver USB:**
    - Verifique se o driver USB do seu dispositivo está atualizado, geralmente encontrado no site do fabricante.
