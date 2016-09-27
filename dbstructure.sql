
CREATE TABLE marcas (
	id_marca serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL
);

CREATE TABLE modelos (
	id_modelo serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	id_marca INTEGER NOT NULL,
	
	CONSTRAINT fk_modelos_id_marca FOREIGN KEY (id_marca)
      REFERENCES marcas (id_marca) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE cambios (
	id_cambio serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(200) NULL
);


CREATE TABLE carrocerias (
	id_carroceria serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(200) NULL
);


CREATE TABLE combustiveis (
	id_combustivel serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	descricao VARCHAR(200) NULL
);

CREATE TABLE versoes (
	id_versao serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL,
	id_combustivel INTEGER NULL,
	id_cambio INTEGER NULL,
	id_carroceria INTEGER NULL,
	id_modelo INTEGER NOT NULL,
	
	CONSTRAINT fk_versoes_id_modelo FOREIGN KEY (id_modelo)
      REFERENCES modelos (id_modelo) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_versoes_id_cambio FOREIGN KEY (id_cambio)
      REFERENCES cambios (id_cambio) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_versoes_id_carroceria FOREIGN KEY (id_carroceria)
      REFERENCES carrocerias (id_carroceria) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_versoes_id_combustivel FOREIGN KEY (id_combustivel)
      REFERENCES combustiveis (id_combustivel) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE opcionais (
	id_opcional serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL
);


CREATE TABLE usuarios (
	id_usuario serial PRIMARY KEY NOT NULL,
	nome VARCHAR(50) NOT NULL
);

CREATE TABLE veiculos (
	id_veiculo serial PRIMARY KEY NOT NULL,
	km INTEGER NOT NULL,
	id_combustivel INTEGER NOT NULL,
	id_cambio INTEGER NOT NULL,
	id_carroceria INTEGER NOT NULL,
	id_versao INTEGER NOT NULL,
	
	CONSTRAINT fk_veiculos_id_versao FOREIGN KEY (id_versao)
      REFERENCES versoes (id_versao) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_veiculos_id_cambio FOREIGN KEY (id_cambio)
      REFERENCES cambios (id_cambio) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_veiculos_id_carroceria FOREIGN KEY (id_carroceria)
      REFERENCES carrocerias (id_carroceria) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_veiculos_id_combustivel FOREIGN KEY (id_combustivel)
      REFERENCES combustiveis (id_combustivel) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE anuncios (
	id_anuncio serial PRIMARY KEY NOT NULL,
	preco numeric NOT NULL,
	data_anuncio DATE NOT NULL,
	horario_anuncio TIME NOT NULL,
	data_atualizacao DATE NULL,
	horario_atualizacao DATE NULL,
	observacao VARCHAR(250),
	id_veiculo INTEGER NOT NULL,
	id_usuario INTEGER NOT NULL,
	
	CONSTRAINT fk_anuncios_id_veiculo FOREIGN KEY (id_veiculo)
      REFERENCES veiculos (id_veiculo) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	  
	CONSTRAINT fk_anuncios_id_usuario FOREIGN KEY (id_usuario)
      REFERENCES usuarios (id_usuario) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE fotos (
	id_foto serial PRIMARY KEY NOT NULL,
	diretorio VARCHAR NOT NULL,
	id_anuncio INTEGER NULL,
	
	CONSTRAINT fk_fotos_id_anuncio FOREIGN KEY (id_anuncio)
      REFERENCES anuncios (id_anuncio) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE veiculos_opcionais (
	id_veiculo_opcional serial PRIMARY KEY NOT NULL,
	id_opcional INTEGER NOT NULL,
	id_veiculo INTEGER NOT NULL,
	
	CONSTRAINT fk_veiculos_opcionais_id_opcional FOREIGN KEY (id_opcional)
      REFERENCES opcionais (id_opcional) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
	  
	CONSTRAINT fk_veiculos_opcionais_id_veiculo FOREIGN KEY (id_veiculo)
      REFERENCES veiculos (id_veiculo) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
);

