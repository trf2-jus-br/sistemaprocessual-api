package br.jus.trf2.sistemaprocessual;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.crivano.swaggerservlet.ISwaggerMethod;
import com.crivano.swaggerservlet.ISwaggerModel;
import com.crivano.swaggerservlet.ISwaggerRequest;
import com.crivano.swaggerservlet.ISwaggerResponse;
import com.crivano.swaggerservlet.ISwaggerResponseFile;

public interface ISistemaProcessual {
	public class Nome implements ISwaggerModel {
	}

	public class CPF implements ISwaggerModel {
	}

	public class Email implements ISwaggerModel {
	}

	public class TipoPeticaoIntercorrente implements ISwaggerModel {
		public String id;
		public String descricao;
	}

	public class IdNome implements ISwaggerModel {
		public String id;
		public String nome;
	}

	public class IdNomeClasseCNJ implements ISwaggerModel {
		public String id;
		public String nome;
		public Boolean valordacausaobrigatorio;
		public ClasseCNJ classecnj;
	}

	public class ClasseCNJ implements ISwaggerModel {
		public Double codigo;
		public String descricao;
		public Boolean ativo;
	}

	public class Contagem implements ISwaggerModel {
		public String data;
		public String quantidade;
	}

	public class QuantidadeConfirmada implements ISwaggerModel {
		public String data;
		public String quantidadeDoUsuarioPorConfirmacao;
		public String quantidadeDoUsuarioPorOmissao;
		public String quantidadeDoGrupoPorConfirmacao;
		public String quantidadeDoGrupoPorOmissao;
	}

	public class PeticaoIntercorrente implements ISwaggerModel {
		public String processo;
		public String protocolo;
		public String dataprotocolo;
		public String classe;
		public String unidade;
	}

	public class Mesa implements ISwaggerModel {
		public String idlocal;
		public String idmesa;
		public String nome;
	}

	public class MesaDocumento implements ISwaggerModel {
		public String datadeentrada;
		public String numerodoprocesso;
		public String numerododocumento;
		public String motivo;
		public String situacao;
		public String usuarioinclusao;
	}

	public class MesaMovimento implements ISwaggerModel {
		public String coddoc;
		public String segredo;
		public String numerodoprocesso;
		public String ato;
		public String motivo;
		public String datahoramovimento;
		public String codsecao;
	}

	public class MesaExpediente implements ISwaggerModel {
		public String codsecao;
		public String coddoc;
		public String numerododocumento;
		public String numerodoprocesso;
		public String segredo;
		public String descr;
	}

	public class Numero implements ISwaggerModel {
	}

	public class Orgao implements ISwaggerModel {
	}

	public class Unidade implements ISwaggerModel {
	}

	public class SegredoDeJustica implements ISwaggerModel {
	}

	public class SegredoDeJusticaDeSistema implements ISwaggerModel {
	}

	public class SegredoDeJusticaAbsoluto implements ISwaggerModel {
	}

	public class Eletronico implements ISwaggerModel {
	}

	public class Codigo implements ISwaggerModel {
	}

	public class Descricao implements ISwaggerModel {
	}

	public class Ativo implements ISwaggerModel {
	}

	public class LocalNaUnidade implements ISwaggerModel {
	}

	public class Sentenciado implements ISwaggerModel {
	}

	public class UsuarioAutorizado implements ISwaggerModel {
	}

	public class Baixado implements ISwaggerModel {
	}

	public class CDAs implements ISwaggerModel {
	}

	public class DataUltimoMovimento implements ISwaggerModel {
	}

	public class Pessoa implements ISwaggerModel {
		public String orgao;
		public String id;
		public String nome;
		public String documento;
		public String tipodedocumento;
	}

	public class Aviso implements ISwaggerModel {
		public String idAviso;
		public String dataAviso;
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
		public String dataLimiteIntimacaoAutomatica;
		public String assunto;
		public String dataConfirmacao;
		public String usuarioConfirmacao;
	}

	public class Processo implements ISwaggerModel {
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
		public String cdas;
		public String dataultimomovimento;
	}

	public class Error implements ISwaggerModel {
		public String error;
	}

	public class UsuarioUsernameGetRequest implements ISwaggerRequest {
		public String username;
	}

	public class UsuarioUsernameGetResponse implements ISwaggerResponse {
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

	public interface IUsuarioUsernameGet extends ISwaggerMethod {
		public void run(UsuarioUsernameGetRequest req, UsuarioUsernameGetResponse resp) throws Exception;
	}

	public class ProcessoValidarNumeroGetRequest implements ISwaggerRequest {
		public String numero;
	}

	public class ProcessoValidarNumeroGetResponse implements ISwaggerResponse {
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
		public List<TipoPeticaoIntercorrente> tipopeticaointercorrente;
	}

	public interface IProcessoValidarNumeroGet extends ISwaggerMethod {
		public void run(ProcessoValidarNumeroGetRequest req, ProcessoValidarNumeroGetResponse resp) throws Exception;
	}

	public class ProcessoNumeroPdfGetRequest implements ISwaggerRequest {
		public String numero;
	}

	public class ProcessoNumeroPdfGetResponse implements ISwaggerResponse, ISwaggerResponseFile {
		public String contenttype = "application/pdf";
		public String contentdisposition = "attachment; filename=processo.pdf";
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

	public interface IProcessoNumeroPdfGet extends ISwaggerMethod {
		public void run(ProcessoNumeroPdfGetRequest req, ProcessoNumeroPdfGetResponse resp) throws Exception;
	}

	public class PeticaoInicialTiposDocumentoGetRequest implements ISwaggerRequest {
	}

	public class PeticaoInicialTiposDocumentoGetResponse implements ISwaggerResponse {
		public List<IdNome> list;
	}

	public interface IPeticaoInicialTiposDocumentoGet extends ISwaggerMethod {
		public void run(PeticaoInicialTiposDocumentoGetRequest req, PeticaoInicialTiposDocumentoGetResponse resp)
				throws Exception;
	}

	public class LocalidadeGetRequest implements ISwaggerRequest {
	}

	public class LocalidadeGetResponse implements ISwaggerResponse {
		public List<IdNome> list;
	}

	public interface ILocalidadeGet extends ISwaggerMethod {
		public void run(LocalidadeGetRequest req, LocalidadeGetResponse resp) throws Exception;
	}

	public class LocalidadeIdEspecialidadeGetRequest implements ISwaggerRequest {
		public String id;
	}

	public class LocalidadeIdEspecialidadeGetResponse implements ISwaggerResponse {
		public List<IdNome> list;
	}

	public interface ILocalidadeIdEspecialidadeGet extends ISwaggerMethod {
		public void run(LocalidadeIdEspecialidadeGetRequest req, LocalidadeIdEspecialidadeGetResponse resp)
				throws Exception;
	}

	public class LocalidadeIdEspecialidadeId2ClasseGetRequest implements ISwaggerRequest {
		public String id;
		public String id2;
	}

	public class LocalidadeIdEspecialidadeId2ClasseGetResponse implements ISwaggerResponse {
		public List<IdNomeClasseCNJ> list;
	}

	public interface ILocalidadeIdEspecialidadeId2ClasseGet extends ISwaggerMethod {
		public void run(LocalidadeIdEspecialidadeId2ClasseGetRequest req,
				LocalidadeIdEspecialidadeId2ClasseGetResponse resp) throws Exception;
	}

	public class LocalidadeIdEspecialidadeId2ClasseId3AssuntoGetRequest implements ISwaggerRequest {
		public String id;
		public String id2;
		public String id3;
	}

	public class LocalidadeIdEspecialidadeId2ClasseId3AssuntoGetResponse implements ISwaggerResponse {
		public List<IdNome> list;
	}

	public interface ILocalidadeIdEspecialidadeId2ClasseId3AssuntoGet extends ISwaggerMethod {
		public void run(LocalidadeIdEspecialidadeId2ClasseId3AssuntoGetRequest req,
				LocalidadeIdEspecialidadeId2ClasseId3AssuntoGetResponse resp) throws Exception;
	}

	public class PessoaFisicaDocumentoGetRequest implements ISwaggerRequest {
		public String documento;
	}

	public class PessoaFisicaDocumentoGetResponse implements ISwaggerResponse {
		public List<Pessoa> list;
	}

	public interface IPessoaFisicaDocumentoGet extends ISwaggerMethod {
		public void run(PessoaFisicaDocumentoGetRequest req, PessoaFisicaDocumentoGetResponse resp) throws Exception;
	}

	public class PessoaJuridicaDocumentoGetRequest implements ISwaggerRequest {
		public String documento;
	}

	public class PessoaJuridicaDocumentoGetResponse implements ISwaggerResponse {
		public List<Pessoa> list;
	}

	public interface IPessoaJuridicaDocumentoGet extends ISwaggerMethod {
		public void run(PessoaJuridicaDocumentoGetRequest req, PessoaJuridicaDocumentoGetResponse resp)
				throws Exception;
	}

	public class AdvogadoDocumentoGetRequest implements ISwaggerRequest {
		public String documento;
	}

	public class AdvogadoDocumentoGetResponse implements ISwaggerResponse {
		public List<Pessoa> list;
	}

	public interface IAdvogadoDocumentoGet extends ISwaggerMethod {
		public void run(AdvogadoDocumentoGetRequest req, AdvogadoDocumentoGetResponse resp) throws Exception;
	}

	public class OrgaoPublicoListarGetRequest implements ISwaggerRequest {
		public String tipodedocumento;
	}

	public class OrgaoPublicoListarGetResponse implements ISwaggerResponse {
		public List<Pessoa> list;
	}

	public interface IOrgaoPublicoListarGet extends ISwaggerMethod {
		public void run(OrgaoPublicoListarGetRequest req, OrgaoPublicoListarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGetRequest implements ISwaggerRequest {
		public String username;
		public String numero;
	}

	public class UsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGetResponse implements ISwaggerResponse {
		public String identencerraprazos;
		public Double sigilo;
		public Boolean parte;
		public List<TipoPeticaoIntercorrente> tipos;
	}

	public interface IUsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGet extends ISwaggerMethod {
		public void run(UsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGetRequest req, UsuarioUsernameProcessoNumeroPeticaoIntercorrenteValidarGetResponse resp)
				throws Exception;
	}

	public class UsuarioUsernamePeticaoIntercorrenteContarGetRequest implements ISwaggerRequest {
		public String username;
		public String dias;
	}

	public class UsuarioUsernamePeticaoIntercorrenteContarGetResponse implements ISwaggerResponse {
		public List<Contagem> list;
	}

	public interface IUsuarioUsernamePeticaoIntercorrenteContarGet extends ISwaggerMethod {
		public void run(UsuarioUsernamePeticaoIntercorrenteContarGetRequest req,
				UsuarioUsernamePeticaoIntercorrenteContarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernamePeticaoIntercorrenteListarGetRequest implements ISwaggerRequest {
		public String username;
		public String data;
	}

	public class UsuarioUsernamePeticaoIntercorrenteListarGetResponse implements ISwaggerResponse {
		public List<PeticaoIntercorrente> list;
	}

	public interface IUsuarioUsernamePeticaoIntercorrenteListarGet extends ISwaggerMethod {
		public void run(UsuarioUsernamePeticaoIntercorrenteListarGetRequest req,
				UsuarioUsernamePeticaoIntercorrenteListarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameAvisoConfirmadoContarGetRequest implements ISwaggerRequest {
		public String username;
		public String dias;
	}

	public class UsuarioUsernameAvisoConfirmadoContarGetResponse implements ISwaggerResponse {
		public List<QuantidadeConfirmada> list;
	}

	public interface IUsuarioUsernameAvisoConfirmadoContarGet extends ISwaggerMethod {
		public void run(UsuarioUsernameAvisoConfirmadoContarGetRequest req,
				UsuarioUsernameAvisoConfirmadoContarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameAvisoConfirmadoListarGetRequest implements ISwaggerRequest {
		public String username;
		public String dataInicial;
		public String dataFinal;
		public Boolean confirmacao;
		public Boolean omissao;
		public Boolean grupo;
	}

	public class UsuarioUsernameAvisoConfirmadoListarGetResponse implements ISwaggerResponse {
		public List<Aviso> list;
	}

	public interface IUsuarioUsernameAvisoConfirmadoListarGet extends ISwaggerMethod {
		public void run(UsuarioUsernameAvisoConfirmadoListarGetRequest req,
				UsuarioUsernameAvisoConfirmadoListarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameAvisoPendenteExportarGetRequest implements ISwaggerRequest {
		public String username;
	}

	public class UsuarioUsernameAvisoPendenteExportarGetResponse implements ISwaggerResponse, ISwaggerResponseFile {
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

	public interface IUsuarioUsernameAvisoPendenteExportarGet extends ISwaggerMethod {
		public void run(UsuarioUsernameAvisoPendenteExportarGetRequest req,
				UsuarioUsernameAvisoPendenteExportarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameAvisoConfirmadoExportarGetRequest implements ISwaggerRequest {
		public String username;
	}

	public class UsuarioUsernameAvisoConfirmadoExportarGetResponse
			implements ISwaggerResponse, ISwaggerResponseFile {
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

	public interface IUsuarioUsernameAvisoConfirmadoExportarGet extends ISwaggerMethod {
		public void run(UsuarioUsernameAvisoConfirmadoExportarGetRequest req,
				UsuarioUsernameAvisoConfirmadoExportarGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameProcessoNumeroGetRequest implements ISwaggerRequest {
		public String username;
		public String numero;
	}

	public class UsuarioUsernameProcessoNumeroGetResponse implements ISwaggerResponse {
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
	}

	public interface IUsuarioUsernameProcessoNumeroGet extends ISwaggerMethod {
		public void run(UsuarioUsernameProcessoNumeroGetRequest req,
				UsuarioUsernameProcessoNumeroGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameMesasGetRequest implements ISwaggerRequest {
		public String username;
	}

	public class UsuarioUsernameMesasGetResponse implements ISwaggerResponse {
		public List<Mesa> list;
	}

	public interface IUsuarioUsernameMesasGet extends ISwaggerMethod {
		public void run(UsuarioUsernameMesasGetRequest req, UsuarioUsernameMesasGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameLocalIdMesaId2DocumentosGetRequest implements ISwaggerRequest {
		public String username;
		public String id;
		public String id2;
	}

	public class UsuarioUsernameLocalIdMesaId2DocumentosGetResponse implements ISwaggerResponse {
		public List<MesaDocumento> list;
	}

	public interface IUsuarioUsernameLocalIdMesaId2DocumentosGet extends ISwaggerMethod {
		public void run(UsuarioUsernameLocalIdMesaId2DocumentosGetRequest req,
				UsuarioUsernameLocalIdMesaId2DocumentosGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameLocalIdMesaId2MovimentosGetRequest implements ISwaggerRequest {
		public String username;
		public String id;
		public String id2;
	}

	public class UsuarioUsernameLocalIdMesaId2MovimentosGetResponse implements ISwaggerResponse {
		public List<MesaMovimento> list;
	}

	public interface IUsuarioUsernameLocalIdMesaId2MovimentosGet extends ISwaggerMethod {
		public void run(UsuarioUsernameLocalIdMesaId2MovimentosGetRequest req,
				UsuarioUsernameLocalIdMesaId2MovimentosGetResponse resp) throws Exception;
	}

	public class UsuarioUsernameLocalIdMesaId2ExpedientesGetRequest implements ISwaggerRequest {
		public String username;
		public String id;
		public String id2;
	}

	public class UsuarioUsernameLocalIdMesaId2ExpedientesGetResponse implements ISwaggerResponse {
		public List<MesaExpediente> list;
	}

	public interface IUsuarioUsernameLocalIdMesaId2ExpedientesGet extends ISwaggerMethod {
		public void run(UsuarioUsernameLocalIdMesaId2ExpedientesGetRequest req,
				UsuarioUsernameLocalIdMesaId2ExpedientesGetResponse resp) throws Exception;
	}

}