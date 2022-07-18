-- Table: public.graph_data
-- DROP TABLE IF EXISTS public.graph_data;
CREATE TABLE IF NOT EXISTS public.graph_data (
    graph_id bigserial NOT NULL,
    CONSTRAINT graph_data_pkey PRIMARY KEY (graph_id)
);

-- Table: public.axis_data
-- DROP TABLE IF EXISTS public.axis_data;
CREATE TABLE IF NOT EXISTS public.axis_data (
    axis_id bigserial NOT NULL,
    categories varchar,
    axisdata_id int,
    CONSTRAINT axis_data_pkey PRIMARY KEY (axis_id),
    foreign key (axisdata_id) references public.graph_data(graph_id)
);

-- Table: public.series_data
-- DROP TABLE IF EXISTS public.series_data;
CREATE TABLE IF NOT EXISTS public.series_data (
    series_id bigserial NOT NULL,
    name varchar,
    data varchar,
    seriesdata_id int,
    CONSTRAINT series_data_pkey PRIMARY KEY (series_id),
    foreign key (seriesdata_id) references public.graph_data(graph_id)
);
