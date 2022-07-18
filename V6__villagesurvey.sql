-- Table: public.village_survey_form
-- DROP TABLE IF EXISTS public.village_survey_form;
CREATE TABLE IF NOT EXISTS public.village_survey_form (
    village_survey_id bigserial NOT NULL,
    CONSTRAINT village_survey_form_pkey PRIMARY KEY (village_survey_id)
);

-- Table: public.village_information
-- DROP TABLE IF EXISTS public.village_information;
CREATE TABLE IF NOT EXISTS public.village_information (
    vinfo_id bigserial NOT NULL,
    village int,
    district int,
    block int,
    panchayath int,
    route varchar,
    pincode int,
    villageinfo_id int,
    CONSTRAINT village_information_pkey PRIMARY KEY (vinfo_id),
    foreign key (villageinfo_id) references public.village_survey_form(village_survey_id),
    foreign key (village) references public.village(vid),
    foreign key (district) references public.district(district_id),
    foreign key (panchayath) references public.panchayath(panchayath_id),
    foreign key (block) references public.mandal(mandal_id)            
);

-- Table: public.village_survey
-- DROP TABLE IF EXISTS public.village_survey;
CREATE TABLE IF NOT EXISTS public.village_survey (
    vsurvey_id bigserial NOT NULL,
    question int,
    value varchar,
    villagesurv_id int,
    CONSTRAINT village_survey_pkey PRIMARY KEY (vsurvey_id),
    foreign key (question) references public.question(id),
    foreign key (villagesurv_id) references public.village_survey_form(village_survey_id)
);
