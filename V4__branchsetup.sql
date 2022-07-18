-- Table: public.branch_setup
-- DROP TABLE IF EXISTS public.branch_setup;
CREATE TABLE IF NOT EXISTS public.branch_setup (
    branch_setup_id bigserial NOT NULL,
    branch_ready_for_operations boolean,
    comments varchar,
    CONSTRAINT branch_setup_pkey PRIMARY KEY (branch_setup_id)
);

-- Table: public.resource_person_detail
-- DROP TABLE IF EXISTS public.resource_person_detail;
CREATE TABLE IF NOT EXISTS public.resource_person_detail (
    e_id bigserial NOT NULL,
    name varchar,
    designation varchar,
    contact_number bigint,
    resourcedetails_id int,
    CONSTRAINT resource_person_detail_pkey PRIMARY KEY (e_id),
    foreign key (resourcedetails_id) references public.branch_setup(branch_setup_id)
);


-- Table: public.branch_setup_survey
-- DROP TABLE IF EXISTS public.branch_setup_survey;
CREATE TABLE IF NOT EXISTS public.branch_setup_survey (
    survey_id bigserial NOT NULL,
    title varchar,
    setupsurvey_id int,
    CONSTRAINT branch_setup_survey_pkey PRIMARY KEY (survey_id),
    foreign key (setupsurvey_id) references public.branch_setup(branch_setup_id)
);

-- Table: public.particular_records
-- DROP TABLE IF EXISTS public.particular_records;
CREATE TABLE IF NOT EXISTS public.particular_records (
    pid bigserial NOT NULL,
    particular varchar,
    records_id int,
    CONSTRAINT particular_records_pkey PRIMARY KEY (pid),
    foreign key (records_id) references public.branch_setup_survey(survey_id)
);

-- Table: public.records
-- DROP TABLE IF EXISTS public.records;
CREATE TABLE IF NOT EXISTS public.records (
    rid bigserial NOT NULL,
    particular varchar,
    value boolean,
    asset_id bigint,
    record_id int,
    CONSTRAINT records_pkey PRIMARY KEY (rid),
    foreign key (record_id) references public.particular_records(pid)
);

