-- Table: public.new_company
-- DROP TABLE IF EXISTS public."new_company";
CREATE TABLE IF NOT EXISTS public."new_company"
(
    id bigserial NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT new_company_pkey PRIMARY KEY (id)
   -- foreign key (eid) references public.new_employee(eid)
);


-- Table: public.new_trainee
-- DROP TABLE IF EXISTS public."new_trainee";
CREATE TABLE IF NOT EXISTS public."new_trainee"
(
    tid bigserial NOT NULL,
    tname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    trainee_id bigint,
    CONSTRAINT new_trainee_pkey PRIMARY KEY (tid),
    foreign key (trainee_id) references public.new_company(id)
);


-- Table: public.new_employee
-- DROP TABLE IF EXISTS public.new_employee;
CREATE TABLE IF NOT EXISTS public.new_employee
(
eid bigserial NOT NULL,
ename character varying(50) COLLATE pg_catalog."default" NOT NULL,
emp_id bigint,
CONSTRAINT new_employee_pkey PRIMARY KEY (eid),
foreign key (emp_id) references public.new_company(id)
);


-- Table: public.new_subclass
-- DROP TABLE IF EXISTS public."new_subclass";
CREATE TABLE IF NOT EXISTS public."new_subclass"
(
    sid bigserial NOT NULL,
    sname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    sub_id bigint,
    CONSTRAINT new_subclass_pkey PRIMARY KEY (sid),
    foreign key (sub_id) references public.new_employee(eid)
);




