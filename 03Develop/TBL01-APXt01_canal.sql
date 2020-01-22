DROP TABLE IF EXISTS public."APXt01_canal";

CREATE TABLE public."APXt01_canal"
(
	cod_emp VARCHAR(02),
	cod_idio_iso VARCHAR(02),	
    cod_canal VARCHAR(3),
    txt_abrv VARCHAR(10),
    txt_desc VARCHAR(50),
    fec_usr timestamp without time zone,
	txt_usr VARCHAR(20),
	fec_mod timestamp without time zone,
	txt_usr_mod VARCHAR(20),
	fec_anu timestamp without time zone,
	txt_usr_anu VARCHAR(20),
	
    CONSTRAINT "PKAPXt01_cod_canal" PRIMARY KEY (cod_emp, cod_idio_iso, cod_canal)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;