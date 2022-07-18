-- Table: public.question
-- DROP TABLE IF EXISTS public.question;
CREATE TABLE IF NOT EXISTS public.question (
    id bigserial NOT NULL,
    question character varying(200) NOT NULL,
    type character varying(20) NOT NULL,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT question_pkey PRIMARY KEY (id)
);

--Table: public.rating
-- DROP TABLE IF EXISTS public.rating;
create table if not exists public.rating(
	rat_id bigserial not null,
	question int,
	value varchar,
	rating_id bigint,
	CONSTRAINT rating_pkey PRIMARY KEY (rat_id),
	foreign key (rating_id) references public.survey_data(surveydata_id),
	foreign key (question) references public.question(id)
);

-- Table: public.question_option
-- DROP TABLE IF EXISTS public.question_option;
CREATE TABLE IF NOT EXISTS public.question_option (
    id bigserial NOT NULL,
    option text,
    value text,
    question bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT question_option_pkey PRIMARY KEY (id),
    foreign key (question) references public.question(id)
);

CREATE UNIQUE INDEX if not exists c_question_option_unique ON public.question_option (option);

-- Table: public.branch_premise
-- DROP TABLE IF EXISTS public.branch_premise;
CREATE TABLE IF NOT EXISTS public.branch_premise (
    branch_premise_id bigserial NOT NULL,
    branch_name int,
    branch_location int,
    CONSTRAINT branch_premise_pkey PRIMARY KEY (branch_premise_id),
    foreign key (branch_name) references public.branch(branch_id),
    foreign key (branch_location) references public.branch(branch_id)
);

-- Table: public.premise_information
-- DROP TABLE IF EXISTS public.premise_information;
CREATE TABLE IF NOT EXISTS public.premise_information (
    premise_id bigserial NOT NULL,
    type varchar ,
    comment varchar,
    question int,
    value varchar,
    premiseinformation_id bigint,
    CONSTRAINT premise_information_pkey PRIMARY KEY (premise_id),
    foreign key (question) references public.question(id),
    foreign key (value) references public.question_option(option),
    foreign key (premiseinformation_id) references public.branch_premise(branch_premise_id)
);
