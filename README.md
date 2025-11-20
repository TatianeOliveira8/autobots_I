# AutoBots - Gestão das Lojas Especializadas em Manutenção Veicular

## Estrutura e funcionalidades

O AutoBots é um sistema voltado para gerenciamento de clientes, documentos, telefones e endereço de lojas de manutenção veicular e vendas de autopeças.  

Funcionalidades principais:  
- CRUD de clientes.  
- CRUD de documentos, telefones e endereços para os clientes.  
- Estrutura de micro-serviços seguindo princípios **SOLID**.

---

## Rotas disponíveis

### **CLIENTE:**
- **GET** `http://localhost:8080/cliente/clientes` - Lista todos os clientes  
- **GET** `http://localhost:8080/cliente/cliente/{id}` - Busca cliente por ID  
- **POST** `http://localhost:8080/cliente/cadastro` - Criar cliente  
- **PUT** `http://localhost:8080/cliente/atualizar` - Atualizar cliente  
- **DELETE** `http://localhost:8080/cliente/excluir` - Excluir cliente  

### **DOCUMENTO:**
- **GET** `http://localhost:8080/documento/documentos`  
- **GET** `http://localhost:8080/documento/{id}`  
- **POST** `http://localhost:8080/documento/cadastro`  
- **PUT** `http://localhost:8080/documento/atualizar`  
- **DELETE** `http://localhost:8080/documento/excluir`  

### **TELEFONE:**
- **GET** `http://localhost:8080/telefone/telefones`  
- **GET** `http://localhost:8080/telefone/{id}`  
- **POST** `http://localhost:8080/telefone/cadastro`  
- **PUT** `http://localhost:8080/telefone/atualizar`  
- **DELETE** `http://localhost:8080/telefone/excluir`  

### **ENDEREÇO:**
- **GET** `http://localhost:8080/endereco/enderecos`  
- **GET** `http://localhost:8080/endereco/{id}`  
- **POST** `http://localhost:8080/endereco/cadastro`  
- **PUT** `http://localhost:8080/endereco/atualizar`  
- **DELETE** `http://localhost:8080/endereco/excluir`  

---

## Exemplo de JSON para teste rápido para http://localhost:8080/cliente/cadastro:

```json
{
  "nome": "João Silva",
  "nomeSocial": "João",
  "dataNascimento": "1990-05-15",
  "dataCadastro": "2025-11-19",
  "documentos": [
    {
      "tipo": "CPF",
      "numero": "123.456.789-00"
    }
  ],
  "endereco": {
    "estado": "SP",
    "cidade": "São Paulo",
    "bairro": "Centro",
    "rua": "Rua das Flores",
    "numero": "100",
    "codigoPostal": "01000-000"
  },
  "telefones": [
    {
      "ddd": "11",
      "numero": "98765-4321"
    }
  ]
}
```
## Ambiente de Teste

O sistema foi testado no seguinte ambiente:

- **Java:** 17  
- **Framework:** Spring Boot  
- **IDE:** VS Code
