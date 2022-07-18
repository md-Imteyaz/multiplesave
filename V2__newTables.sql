-- Table: public.state
-- DROP TABLE IF EXISTS public.state;
CREATE TABLE IF NOT EXISTS public.state (
    state_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT state_pkey PRIMARY KEY (state_id)
);


-- Table: public.district
-- DROP TABLE IF EXISTS public.district;
CREATE TABLE IF NOT EXISTS public.district (
    district_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    state bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT district_pkey PRIMARY KEY (district_id),
    foreign key (state) references public.state(state_id)
);

-- Table: public.mandal
-- DROP TABLE IF EXISTS public.mandal;
CREATE TABLE IF NOT EXISTS public.mandal (
    mandal_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    district bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT mandal_pkey PRIMARY KEY (mandal_id),
    foreign key (district) references public.district(district_id)
);

-- Table: public.branch
-- DROP TABLE IF EXISTS public.branch;
CREATE TABLE IF NOT EXISTS public.branch (
    branch_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    mandal bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT branch_pkey PRIMARY KEY (branch_id),
    foreign key (mandal) references public.mandal(mandal_id)
);

-- Table: public.panchayath
-- DROP TABLE IF EXISTS public.panchayath;
CREATE TABLE IF NOT EXISTS public.panchayath (
    panchayath_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    mandal bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT panchayath_pkey PRIMARY KEY (panchayath_id),
    foreign key (mandal) references public.mandal(mandal_id)
);

-- Table: public.village
-- DROP TABLE IF EXISTS public.village;
CREATE TABLE IF NOT EXISTS public.village (
    vid bigserial NOT NULL,
    name character varying(50) NOT NULL,
    panchayath bigint,
    classification bigint,
    no_of_households bigint,
    route text,
    pincode bigint,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    CONSTRAINT village_pkey PRIMARY KEY (vid)
);

-- Table: public.survey_data
-- DROP TABLE IF EXISTS public.survey_data;
CREATE TABLE IF NOT EXISTS public.survey_data (
    surveydata_id bigserial NOT NULL, 
    CONSTRAINT surveydata_pkey PRIMARY KEY (surveydata_id)
);  



-- Table: public.operational_area
-- DROP TABLE IF EXISTS public.operational_area;
create table if not exists public.operational_area(
branchoperationals_id bigserial not null,
state_id bigint not null,
district_id bigint not null,
blocks_id bigint not null,
pincode varchar not null,
operationalblocks_id bigint,
CONSTRAINT operationalArea_pkey PRIMARY KEY (branchoperationals_id),
foreign key (state_id) references public.state(state_id),
foreign key (district_id) references public.district(district_id),
foreign key (blocks_id) references public.mandal(mandal_id),
foreign key (operationalblocks_id) references public.survey_data(surveydata_id)
);

--Table: public.financial_institutes
-- DROP TABLE IF EXISTS public.financial_institutes;
create table if not exists public.financial_institutes(
	financialinfo_id bigserial not null,
	finfo_id bigint,
	CONSTRAINT financialInstitutes_pkey PRIMARY KEY (financialinfo_id),
	foreign key (finfo_id) references public.survey_data(surveydata_id)
);


--Table: public.villages_visited
-- DROP TABLE IF EXISTS public.villages_visited;
create table if not exists public.villages_visited(
	visited_id bigserial not null,
	villagevisited_id bigint,
	CONSTRAINT villagesVisited_pkey PRIMARY KEY (visited_id),
	foreign key (villagevisited_id) references public.survey_data(surveydata_id)
);


-- Table: public.negative_areas
-- DROP TABLE IF EXISTS public.negative_areas;
CREATE TABLE IF NOT EXISTS public.negative_areas (
    negative_area_id bigserial NOT NULL,
    branch_area_id bigint NOT NULL,
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    nareas_id int,
    CONSTRAINT negative_areas_pkey PRIMARY KEY (negative_area_id),
    FOREIGN KEY (branch_area_id) REFERENCES public.branch (branch_id),
    foreign key (nareas_id) references public.survey_data(surveydata_id)
);

--Table: public.negative_occupation
-- DROP TABLE IF EXISTS public.negative_occupation;
create table if not exists public.negative_occupation(
	negative_occupation_id bigserial not null,
	other_information varchar,
	assessed_risk varchar,
	noccupations_id bigint,
	CONSTRAINT negative_occupation_pkey PRIMARY KEY (negative_occupation_id),
	foreign key (noccupations_id) references public.survey_data(surveydata_id)
);



--Table: public.recommendations
-- DROP TABLE IF EXISTS public.recommendations;
create table if not exists public.recommendations(
	recom_id bigserial not null,
	option1 varchar,
	block1 int,
	option2 varchar,
	block2 int,
	final_recommendations varchar,
	recommend_id bigint,
	CONSTRAINT recommendations_pkey PRIMARY KEY (recom_id),
	foreign key (recommend_id) references public.survey_data(surveydata_id)
);

-- Table: public.operational_details
-- DROP TABLE IF EXISTS public.operational_details;
create table if not exists public.operational_details(
oid bigserial not null,
client_detail bigint not null,
pos bigint not null,
par bigint not null,
amt_par bigint not null,
details_id bigint,
CONSTRAINT operationalDetails_pkey PRIMARY KEY (oid),
foreign key (details_id) references public.financial_institutes(financialinfo_id)
); 

-- Table: public.major_villages
-- DROP TABLE IF EXISTS public.major_villages;
create table if not exists public.major_villages(
	majorpar_id bigserial not null,
	name character  varying(255) not null,
	clients character varying(255) not null,
	reasons character varying(255) not null,
	mpar_id bigint,
	CONSTRAINT majorVillages_pkey PRIMARY KEY (majorpar_id),
	foreign key (mpar_id) references public.financial_institutes(financialinfo_id)
);

--Table: public.negative_villages
-- DROP TABLE IF EXISTS public.negative_villages;
create table if not exists public.negative_villages(
	negativevillage_id bigserial not null,
	village_name character varying(255) not null,
	negative_reason character varying(255) not null,
	nvillages_id bigint,
	CONSTRAINT negativeVillages_pkey PRIMARY KEY (negativevillage_id),
	foreign key (nvillages_id) references public.financial_institutes(financialinfo_id)
);

--Table: public.financial_info
-- DROP TABLE IF EXISTS public.financial_info;
create table if not exists public.financial_info(
	finformation_id bigserial not null,
	institution_name character varying(225) not null,
	contact_person character varying(225) not null,
	contact_number bigint not null,
	coordinates character varying(225) not null,
	operating_since Date NOT NULL ,
	info_id bigint,
	CONSTRAINT financialInfo_pkey PRIMARY KEY (finformation_id),
	foreign key (info_id) references public.financial_institutes(financialinfo_id)
);


--Table: public.other_details
-- DROP TABLE IF EXISTS public.other_details;
create table if not exists public.other_details(
	other_id bigserial not null,
	contact_person character varying(255) not null,
	contact_number bigint not null,
	number_of_households character varying(255) not null,
	number_of_milk_centers character varying(255) not null,
	number_of_kirana_shops character varying(255) not null,
	number_of_cosmetics_shops character varying(255) not null,
	number_of_teaeastries character varying(255) not null,
	number_of_other_shops character varying(255) not null,
	otherdetails_id bigint,
	CONSTRAINT otherDetails_pkey PRIMARY KEY (other_id),
	foreign key (otherdetails_id) references public.villages_visited(visited_id)
);

-- Table: public.economic_village
-- DROP TABLE IF EXISTS public.economic_village;
CREATE TABLE IF NOT EXISTS public.economic_village (
    economic_id bigserial NOT NULL,
    village_name character varying(50) NOT NULL,
    district_name character varying(50) NOT NULL,
    mandal_name character varying(50) NOT NULL,
    pincode bigint,
    coordinates character varying(50) NOT NULL,
    present_time timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    economicinfo_id bigint,
    CONSTRAINT economic_village_pkey PRIMARY KEY (economic_id),
    foreign key (economicinfo_id) references public.villages_visited(visited_id)
);
--Table: public.bankAndLendingInstitutions
-- DROP TABLE IF EXISTS public.bankAndLendingInstitutions;
create table if not exists public.bank_lending_institutions(
bank_id bigserial not null,
bank_name character varying(255) not null,
type character varying(255) not null,
bank_clients character varying(255) not null,
bankinst_id bigint,
CONSTRAINT bankAndLendingInstitutions_pkey PRIMARY KEY (bank_id),
foreign key (bankinst_id) references public.villages_visited(visited_id)
);

-- Table: public.activity
-- DROP TABLE IF EXISTS public.activity;
CREATE TABLE IF NOT EXISTS public.activity
(
    activity_id bigserial NOT NULL,
    name character varying(50) NOT NULL,
    created_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_user bigint NOT NULL,
    modified_user bigint NOT NULL,
    modified_on timestamp without time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    active smallint NOT NULL DEFAULT 1,
    act_id bigint,
    CONSTRAINT activity_pkey PRIMARY KEY (activity_id),
    foreign key (act_id) references public.villages_visited(visited_id)
);

-- Table: public.ring_leader
-- DROP TABLE IF EXISTS public.ring_leader;
CREATE TABLE IF NOT EXISTS public.ring_leader
(
    ring_leader_id bigserial NOT NULL,
    ring_leader varchar,
    identifier1 varchar,
    identifier2 varchar,
    ring_id bigint,
    CONSTRAINT ring_leader_pkey PRIMARY KEY (ring_leader_id),
    foreign key (ring_id) references public.negative_areas(negative_area_id)
);

-- Table: public.negative_occupation_info
-- DROP TABLE IF EXISTS public.negative_occupation_info;
CREATE TABLE IF NOT EXISTS public.negative_occupation_info
(
    negative_occup_info_id bigserial NOT NULL,
    negative_occupation varchar,
    area varchar,
    noccupinfo_id bigint,
    CONSTRAINT negative_occupation_info_pkey PRIMARY KEY (negative_occup_info_id),
    foreign key (noccupinfo_id) references public.negative_occupation(negative_occupation_id)
);
    
