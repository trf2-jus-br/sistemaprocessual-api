package br.jus.trf2.sistemaprocessual;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.crivano.swaggerservlet.ISwaggerMethod;
import com.crivano.swaggerservlet.ISwaggerModel;
import com.crivano.swaggerservlet.ISwaggerRequest;
import com.crivano.swaggerservlet.ISwaggerResponse;
import com.crivano.swaggerservlet.ISwaggerResponseFile;

public interface ISistemaProcessual {
	public static class Nome implements ISwaggerModel {
	}

	public static class CPF implements ISwaggerModel {
	}

	public static class Email implements ISwaggerModel {
	}

	public static class TipoPeticaoIntercorrente implements ISwaggerModel {
		public String id;
		public String descricao;
	}

	public static class AvisoPeticaoIntercorrente implements ISwaggerModel {
		public String id;
		public String evento;
		public Date data;
	}

	public static class IdNome implements ISwaggerModel {
		public String id;
		public String nome;
	}

	public static class IdNomeClasseCNJ implements ISwaggerModel {
		public String id;
		public String nome;
		public Boolean valordacausaobrigatorio;
		public ClasseCNJ classecnj;
	}

	public static class ClasseCNJ implements ISwaggerModel {
		public Double codigo;
		public String descricao;
		public Boolean ativo;
	}

	public static class Contagem implements ISwaggerModel {
		public String data;
		public String quantidade;
	}

	public static class QuantidadeConfirmada implements ISwaggerModel {
		public String data;
		public String quantidadeDoUsuarioPorConfirmacao;
		public String quantidadeDoUsuarioPorOmissao;
		public String quantidadeDoGrupoPorConfirmacao;
		public String quantidadeDoGrupoPorOmissao;
	}

	public static class PeticaoIntercorrente implements ISwaggerModel {
		public String processo;
		public String protocolo;
		public String dataprotocolo;
		public String classe;
		public String unidade;
	}

	public static class Mesa implements ISwaggerModel {
		public String idlocal;
		public String idmesa;
		public String nome;
	}

	public static class MesaDocumento implements ISwaggerModel {
		public Date dataDeInclusao;
		public String id;
		public String numeroDoDocumento;
		public String numeroDoProcesso;
		public String autor;
		public String reu;
		public String descricao;
		public String status;
		public String descricaoDoStatus;
		public String tipoDoDocumento;
		public String identificadorDoUsuarioQueIncluiu;
		public String nomeDoUsuarioQueIncluiu;
		public String siglaDaUnidade;
		public String conteudo;
		public String diferencas;
		public Double similaridade;
		public Double idPadrao;
		public List<Lembrete> lembretes = new ArrayList<>();
	}

	public static class Lembrete implements ISwaggerModel {
		public Date dataDeInclusao;
		public String id;
		public String identificadorDoUsuario;
		public String nomeDoUsuario;
		public String conteudo;
	}

	public static class VotoDocumento implements ISwaggerModel {
		public String id;
		public String idProcesso;
		public String idMinuta;
		public String numeroDoProcesso;
		public String statusProcesso;
		public String comSituacaoProcesso;
		public String dataDeInclusao;
		public String siglaDaUnidade;
		public String sequencia;
		public String tipoDeInclusao;
		public String numeroDoDocumento;
		public String relator;
		public String autor;
		public String reu;
		public List<DestaqueItem> destaque = new ArrayList<>();
		public List<VotoProferidoItem> voto = new ArrayList<>();
	}

	public static class VotoProferidoItem implements ISwaggerModel {
		public String dataDeInclusao;
		public String magistrado;
		public String voto;
		public String codigoTipo;
		public Boolean proprio;
	}

	public static class DestaqueItem implements ISwaggerModel {
		public String dataDeInclusao;
		public String magistrado;
		public String conteudo;
		public String codigoTipo;
		public String voto;
	}

	public static class Numero implements ISwaggerModel {
	}

	public static class Magistrado implements ISwaggerModel {
	}

	public static class Orgao implements ISwaggerModel {
	}

	public static class Unidade implements ISwaggerModel {
	}

	public static class SegredoDeJustica implements ISwaggerModel {
	}

	public static class SegredoDeJusticaDeSistema implements ISwaggerModel {
	}

	public static class SegredoDeJusticaAbsoluto implements ISwaggerModel {
	}

	public static class Eletronico implements ISwaggerModel {
	}

	public static class Codigo implements ISwaggerModel {
	}

	public static class Descricao implements ISwaggerModel {
	}

	public static class Ativo implements ISwaggerModel {
	}

	public static class LocalNaUnidade implements ISwaggerModel {
	}

	public static class Sentenciado implements ISwaggerModel {
	}

	public static class UsuarioAutorizado implements ISwaggerModel {
	}

	public static class Baixado implements ISwaggerModel {
	}

	public static class PerdeCompetencia implements ISwaggerModel {
	}

	public static class CDAs implements ISwaggerModel {
	}

	public static class DataUltimoMovimento implements ISwaggerModel {
	}

	public static class Pessoa implements ISwaggerModel {
		public String orgao;
		public String id;
		public String nome;
		public String documento;
		public String tipodedocumento;
	}

	public static class Aviso implements ISwaggerModel {
		public String idAviso;
		public Date dataAviso;
		public String tipo;
		public String processo;
		public String unidade;
		public String unidadeNome;
		public String unidadeTipo;
		public String orgao;
		public String localidade;
		public String teor;
		public String eventoIntimacao;
		public String motivoIntimacao;
		public String numeroPrazo;
		public String tipoPrazo;
		public String multiplicadorPrazo;
		public Date dataLimiteIntimacaoAutomatica;
		public Date dataFinalPrazo;
		public String assunto;
		public String dataConfirmacao;
		public String usuarioConfirmacao;
	}

	public static class Processo implements ISwaggerModel {
		public String numero;
		public String orgao;
		public String unidade;
		public String localNaUnidade;
		public Boolean usuarioautorizado;
		public Boolean segredodejustica;
		public Boolean segredodejusticadesistema;
		public Boolean segredodejusticaabsoluto;
		public Boolean eletronico;
		public Boolean sentenciado;
		public Boolean baixado;
		public Boolean perdecompetencia;
		public String cdas;
		public String dataultimomovimento;
		public String autor;
		public String reu;
	}

	public static class CDA implements ISwaggerModel {
		public String numero;
		public String processoadministrativo;
		public String status;
		public String grupo;
		public String codigotributo;
		public String tributo;
		public Double valor;
		public Double valorufir;
		public Date dataorigem;
		public Date datainclusao;
	}

	public static class Error implements ISwaggerModel {
		public String errormsg;
	}

	public interface IUsuarioUsernameGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse {
			public String nome;
			public String cpf;
			public String email;
			public String codusu;
			public String codentidade;
			public String entidade;
			public String codunidade;
			public String unidade;
			public String perfil;
			public Boolean interno;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameTrocarSenhaPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IPeticaoInicialTiposDocumentoGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
		}

		public static class Response implements ISwaggerResponse {
			public List<IdNome> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface ILocalidadeGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
		}

		public static class Response implements ISwaggerResponse {
			public List<IdNome> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface ILocalidadeIdEspecialidadeGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String id;
		}

		public static class Response implements ISwaggerResponse {
			public List<IdNome> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface ILocalidadeIdEspecialidadeId2ClasseGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String id;
			public String id2;
		}

		public static class Response implements ISwaggerResponse {
			public List<IdNomeClasseCNJ> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface ILocalidadeIdEspecialidadeId2ClasseId3AssuntoGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String id;
			public String id2;
			public String id3;
		}

		public static class Response implements ISwaggerResponse {
			public List<IdNome> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IPessoaFisicaDocumentoGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String documento;
		}

		public static class Response implements ISwaggerResponse {
			public List<Pessoa> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IPessoaJuridicaDocumentoGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String documento;
		}

		public static class Response implements ISwaggerResponse {
			public List<Pessoa> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IAdvogadoDocumentoGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String documento;
		}

		public static class Response implements ISwaggerResponse {
			public List<Pessoa> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IOrgaoPublicoListarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String tipodedocumento;
		}

		public static class Response implements ISwaggerResponse {
			public List<Pessoa> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameProcessoNumeroConsultarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String numero;
		}

		public static class Response implements ISwaggerResponse {
			public String numero;
			public String magistrado;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameProcessoConsultarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String tipodedocumento;
			public String documento;
			public String nomeparte;
			public String oab;
		}

		public static class Response implements ISwaggerResponse {
			public List<Processo> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameProcessoNumeroInformacoesAdicionaisGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String numero;
		}

		public static class Response implements ISwaggerResponse {
			public List<CDA> cdas = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String numero;
		}

		public static class Response implements ISwaggerResponse {
			public String identencerraprazos;
			public Double sigilo;
			public Boolean parte;
			public List<TipoPeticaoIntercorrente> tipos = new ArrayList<>();
			public List<AvisoPeticaoIntercorrente> avisos = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernamePeticaoIntercorrenteContarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String dias;
		}

		public static class Response implements ISwaggerResponse {
			public List<Contagem> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernamePeticaoIntercorrenteListarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String data;
		}

		public static class Response implements ISwaggerResponse {
			public List<PeticaoIntercorrente> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameAvisoConfirmadoContarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String dias;
		}

		public static class Response implements ISwaggerResponse {
			public List<QuantidadeConfirmada> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameAvisoConfirmadoListarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String dataInicial;
			public String dataFinal;
			public Boolean confirmacao;
			public Boolean omissao;
			public Boolean grupo;
		}

		public static class Response implements ISwaggerResponse {
			public List<Aviso> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameAvisoPendenteExportarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse, ISwaggerResponseFile {
			public String contenttype = "application/xml";
			public String contentdisposition = "attachment; filename=avisos.xml";
			public Long contentlength;
			public InputStream inputstream;
			public Map<String, List<String>> headerFields;
			public String getContenttype() {
				return contenttype;
			}

			public void setContenttype(String contenttype) {
				this.contenttype = contenttype;
			}

			public String getContentdisposition() {
				return contentdisposition;
			}

			public void setContentdisposition(String contentdisposition) {
				this.contentdisposition = contentdisposition;
			}

			public Long getContentlength() {
				return contentlength;
			}

			public void setContentlength(Long contentlength) {
				this.contentlength = contentlength;
			}

			public InputStream getInputstream() {
				return inputstream;
			}

			public void setInputstream(InputStream inputstream) {
				this.inputstream = inputstream;
			}

			public Map<String, List<String>> getHeaderFields() {
				return headerFields;
			}

			public void setHeaderFields(Map<String, List<String>> headerFields) {
				this.headerFields = headerFields;
			}

		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameAvisoConfirmadoExportarGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse, ISwaggerResponseFile {
			public String contenttype = "application/xml";
			public String contentdisposition = "attachment; filename=avisos.xml";
			public Long contentlength;
			public InputStream inputstream;
			public Map<String, List<String>> headerFields;
			public String getContenttype() {
				return contenttype;
			}

			public void setContenttype(String contenttype) {
				this.contenttype = contenttype;
			}

			public String getContentdisposition() {
				return contentdisposition;
			}

			public void setContentdisposition(String contentdisposition) {
				this.contentdisposition = contentdisposition;
			}

			public Long getContentlength() {
				return contentlength;
			}

			public void setContentlength(Long contentlength) {
				this.contentlength = contentlength;
			}

			public InputStream getInputstream() {
				return inputstream;
			}

			public void setInputstream(InputStream inputstream) {
				this.inputstream = inputstream;
			}

			public Map<String, List<String>> getHeaderFields() {
				return headerFields;
			}

			public void setHeaderFields(Map<String, List<String>> headerFields) {
				this.headerFields = headerFields;
			}

		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameProcessoNumerosGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String numeros;
		}

		public static class Response implements ISwaggerResponse {
			public List<Processo> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameMesasGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse {
			public List<Mesa> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameLocalIdMesaId2DocumentosGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
			public String id2;
			public String ids;
		}

		public static class Response implements ISwaggerResponse {
			public List<MesaDocumento> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameMesaIdDocumentoId2SalvarPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
			public String id2;
			public String html;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameMesaIdDocumentoId2AssinarComSenhaPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
			public String id2;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
			public String errormsg;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameMesaIdDocumentoId2DevolverPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
			public String id2;
			public String lembrete;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameVotosGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse {
			public List<VotoDocumento> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameVotosIdAcompanharPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
			public VotoDocumento voto;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameVotosIdDivergirPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
			public VotoDocumento voto;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameVotosIdPedirVistaPost extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
			public VotoDocumento voto;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameVotosIdMinutasId2Get extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
			public String id;
			public String id2;
		}

		public static class Response implements ISwaggerResponse {
			public String status;
			public String html;
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

	public interface IUsuarioUsernameAvisosGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String username;
		}

		public static class Response implements ISwaggerResponse {
			public List<Aviso> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, SistemaProcessualContext ctx) throws Exception;
	}

}


