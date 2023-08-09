# Setup Inicial

Esta aula fornece instruções passo a passo para preparar o ambiente de desenvolvimento Java (mas que poderá ser adaptada para outras linguagens de programação) e facilitar a colaboração em projetos de programação.

## GitHub

*Uma conta no GitHub é essencial para compartilhar, colaborar e armazenar projetos de programação e desenvolvimento de forma eficiente.*

> **Crie sua conta gratuíta**

<p align="center"> <img src="https://devporai.com.br/wp-content/uploads/2023/02/1.png" alt="Fases de Execução Java"/></p>
<p align="center">
<p align="center"> <a href="https://github.com/">Figura 1. Sign Up GitHub</a></p>

> Gere uma **PERSONAL ACCESS TOKEN**

*Um Personal Access Token é utilizado para conceder acesso seguro a aplicativos e serviços, permitindo que eles interajam com sua conta GitHub sem a necessidade de compartilhar sua senha.*

1. Faça seu login no [GitHub](https://github.com/)
2. Gere um access token: Your Profile >> Settings >> Developer settings >> Personal access tokens >> Tokens (classic) >> Generate new token > Generate new token (classic)
    - *Note*: Ecolha um nome para o token
    - *Expiration*: No expiration
    - *Select scopes*: Selecione todos os campos
    - *Generate token*
    - *Copie a String referente ao token*
    - *Salve em um lugar seguro que você consiga consultar posteriormente*
3. Criação e configurações iniciais concluídas!

**P.S: Você também tem a opção de gerar uma [chave SSH](https://github.com/settings/keys) para estabelecer uma conexão entre sua máquina e o GitHub utilizando o protocolo de comunicação SSH. Para mais informações, acesse: https://youtu.be/xeIErHwL53Q**

---

## Instalações no Sistema Operacional Windows:

### Visual Studio Code

*O Visual Studio Code (VS Code) é um editor de código de código aberto desenvolvido pela Microsoft e pode ser usado com uma variedade de linguagens de programação.​*

> Instalação 

1. Entre no site oficial do Visual Studio Code e faça o [DOWNLOAD](https://code.visualstudio.com/download) "Download for windows"
2. Espere o download concluir e execute o arquivo Install -> Next -> Next ... Finish
3. Pesquise o VS Code nas suas aplicações
4. Instalação concluída!

> Configuração para **desenvolvimento Java**:

*O suporte para Java no Visual Studio Code é fornecido por meio de uma ampla variedade de extensões.​*
 
1. Abrir o Vs code
2. Abrir o menu de extensões: (Ctrl + Shift + X)
3. Colar os comandos abaixo e fazer as instalações:
    - `vscode:extension/vscjava.vscode-java-pack`
    - `vscode:extension/pivotal.vscode-boot-dev-pack`
4. Configuração concluída!

### Git

*Git é um sistema de controle de versão distribuído usado para rastrear alterações em projetos de software e facilitar a colaboração entre desenvolvedores.*

> Instalação

1. Entre no site oficial do [git](https://git-scm.com/download/win)
2. Escolha a opção Windows e o instalador será baixado automáticamente
3. Mantenha as opções pré-selecionadas
4. Next > Install
5. Antes de finaizar a instalação, selecione a opção "Lauch Git Bash"

> Configurações Iniciais

1. No Git Bash:
2. Verifique se o GIT está instalado: `git --version`
3.  Configure o nome de usuário: `git config --global user.name "Seu nome"`
4. Configure o endereço de e-mail (**o mesmo do GitHub**): `git config --global user.email seu_email_do_GitHub@email.br`
5. Verifique as configurações: `git config --list`
6.  Instalação e configurações iniciais concluídas!

---

## Instalações no Sistema Operacional Linux (distro Ubuntu):

### Visual Studio Code

*O Visual Studio Code (VS Code) é um editor de código de código aberto desenvolvido pela Microsoft e pode ser usado com uma variedade de linguagens de programação.​*

> Instalação 

1. Entre no site oficial do Visual Studio Code
2. Faça o [DOWNLOAD](https://code.visualstudio.com/) do arquivo com a extensão .deb
3. Escolha a opção Open With: Software install (default)
4. Pesquise o VS code nas suas aplicações
5. Intalação concluída!

> Configuração para **desenvolvimento Java**:

*O suporte para Java no Visual Studio Code é fornecido por meio de uma ampla variedade de extensões.​*

1. Abrir o Vs code
2. Abrir o menu de extensões: (Ctrl + Shift + X)
3. Colar os comandos abaixo e fazer as instalações:
    - `vscode:extension/vscjava.vscode-java-pack`
    - `vscode:extension/pivotal.vscode-boot-dev-pack`
4. Configuração concluída!

### Git

*Git é um sistema de controle de versão distribuído usado para rastrear alterações em projetos de software e facilitar a colaboração entre desenvolvedores.*

> Instalação

1. Abra o terminal verifique se o GIT está instalado `git --version`
2. Para instalar o GIT, execute o comando: `sudo apt-get install git-all`
3. Verifique se o GIT agora está instalado: `git --version`
   
> Configurações Iniciais

1. Feche o terminal e abra novamente: 
2. Configure o nome de usuário: `git config --global user.name "Seu nome"`
3. Configure o endereço de e-mail: (Mesmo do GitHub) `git config --global user.email seuemail@email.br`
4.  Verifique as configurações: `git config --list`
5. Instalação concluída!

---
**P.S: Caso deseje as instalações para o Sistema Operacional [macOs](https://gist.github.com/cami-la/b17cc7a232d8461a5f8b0df42cb9f516), abre uma issue que eu posso acrescentar aqui! (:**


## Referências

[1] GitHub. Disponível em: https://github.com/.

[2] "Download Visual Studio Code." Visual Studio Code. Disponível em: https://code.visualstudio.com/download.

[3] "Managing your personal access tokens." GitHub Documentation. Disponível em: https://docs.github.com/pt/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens.

[4] "Java in Visual Studio Code." Visual Studio Code Documentation. Disponível em: https://code.visualstudio.com/docs/languages/java.

[5] "Git - Downloads." Git SCM. Disponível em: https://git-scm.com/downloads.

## Autor

<a href="https://www.linkedin.com/in/cami-la/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/64323124?v=4" width="100px;" alt=""/></a>
<br>

Feito com ❤️ por <a href="https://www.instagram.com/camimi_la/" title="Instagram">Cami-la </a> 👋🏽 
