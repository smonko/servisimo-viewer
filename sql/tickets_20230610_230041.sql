--
-- PostgreSQL database dump
--

-- Dumped from database version 11.18
-- Dumped by pg_dump version 15rc2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: tickets; Type: TABLE DATA; Schema: public; Owner: servisimoadmin
--

INSERT INTO "public"."tickets"
(
    "reporter",
    "date",
    "deadline",
    "status",
    "item",
    "description",
    "assignee",
    "severity" 
) 
VALUES
('Stefan Monko', '2023-06-10', '2023-06-15', '1', 'stackstorm', 'not working well', 'smonko', 1),
('Jozko Testovic', '2023-06-10', '2023-06-22', '1', 'stackstorm', 'blabla', 'smonko', 2),
('Anzka Testovacia', '2023-06-10', '2023-06-22', '1', 'stackstorm', 'somethins is not ok', 'monkeyuser', 1),
('Johny Test', '2023-06-10', '2023-06-22', '1', 'terraform', 'its warking but not well', 'smonko', 5),
('Alojz Pokusovic', '2023-06-10', '2023-06-22', '1', 'terraform', 'blabla', 'monkeyuser', 1);




--
-- Name: tickets_id_seq; Type: SEQUENCE SET; Schema: public; Owner: servisimoadmin
--

SELECT pg_catalog.setval('public.tickets_id_seq', 4, true);


--
-- PostgreSQL database dump complete
--

