# NetworkManager

Este Java Project se trata de um projeto com uma classe chamada RedesController.java no
package controller e uma classe Main.java no package view.

A classe RedesController.java contém 3 métodos.

1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional.

2) O segundo, chamado ip, que verifica o Sistema Operacional e, de acordo com o S.O., faz a
chamada de configuração de IP. A leitura do processo chamado verifica cada linha e, imprime, apenas, o nome do
adaptador de rede e o IPv4, portanto, adaptadores sem IPv4 não são mostrados.

3) O terceiro, chamado ping, que verifica o Sistema Operacional e, de
acordo com o S.O., faz a chamada de ping em IPv4 com 10 iterações. A leitura do processo chamado verifica as linhas de saída e exibe, apenas, o tempo médio
do ping. O teste de ping deve ser feito com a URL www.google.com.br.

A Classe Main.java da as opções de chamadas do método ip ou do método ping com
JOptionPane e, dependendo da escolha, instancia a Classe RedesController.java e chama o
método escolhido. A opção de finalizar a aplicação também está disponível.
