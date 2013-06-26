--========================================================================
--
--File:      $RCSfile: proxy_schema.sql,v $
--Version:   $Revision: 1.9 $
--Modified:  $Date: 2013/01/10 23:15:26 $
--
--(c) Copyright 2005-2013 by Mentor Graphics Corp. All rights reserved.
--
--========================================================================
--This document contains information proprietary and confidential to
--Mentor Graphics Corp., and is not for external distribution.
--======================================================================== 
--

CREATE TABLE O_BATTR_PROXY (
	Attr_ID	UNIQUE_ID,
	Obj_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE O_ID_PROXY (
	Oid_ID	INTEGER,
	Obj_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE O_OIDA_PROXY (
	Attr_ID	UNIQUE_ID,
	Obj_ID	UNIQUE_ID,
	Oid_ID	INTEGER,
	ContentPath STRING );

CREATE TABLE O_OBJ_PROXY (
	Obj_ID	UNIQUE_ID,
	Name	STRING,
	Numb	INTEGER,
	Key_Lett	STRING,
	Descrip	STRING,
	SS_ID	UNIQUE_ID,
	AdapterName STRING,
	Order INTEGER,
	ContentPath STRING );

CREATE TABLE O_RTIDA_PROXY (
	Attr_ID	UNIQUE_ID,
	Obj_ID	UNIQUE_ID,
	Oid_ID	INTEGER,
	Rel_ID	UNIQUE_ID,
	OIR_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE R_RTO_PROXY (
	Obj_ID	UNIQUE_ID,
	Rel_ID	UNIQUE_ID,
	OIR_ID	UNIQUE_ID,
	Oid_ID	INTEGER,
	ContentPath STRING );

CREATE TABLE R_RGO_PROXY (
	Obj_ID	UNIQUE_ID,
	Rel_ID	UNIQUE_ID,
	OIR_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE S_DOM_PROXY (
	     Dom_ID	UNIQUE_ID,
	     Name	STRING,
	     Descrip	STRING,
	     Full_Der	INTEGER,
	     Config_ID	UNIQUE_ID,
	     Sys_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE S_DPK_PROXY (
	     DatPack_ID	UNIQUE_ID,
	     Name	STRING,
	     Dom_ID	UNIQUE_ID,
	     Parent_DatPack_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE S_DT_PROXY (
	DT_ID	UNIQUE_ID,
	Dom_ID	UNIQUE_ID,
	Name	STRING,
	Descrip	STRING,
	DefaultValue STRING,
	ContentPath STRING );

CREATE TABLE S_EEPK_PROXY (
	     EEPack_ID	UNIQUE_ID,
	     Name	STRING,
	     Dom_ID	UNIQUE_ID,
	     Parent_EEPack_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE S_FPK_PROXY (
	     FunPack_ID	UNIQUE_ID,
	     Name	STRING,
	     Dom_ID	UNIQUE_ID,
	     Parent_FunPack_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE S_SS_PROXY (
	SS_ID	UNIQUE_ID,
	Name	STRING,
	Descrip	STRING,
	Prefix	STRING,
	Num_Rng	INTEGER,
	Dom_ID	UNIQUE_ID,
	Config_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE SM_ISM_PROXY (
	SM_ID	UNIQUE_ID,
	Obj_ID	UNIQUE_ID,
	ContentPath STRING );

CREATE TABLE SM_ASM_PROXY (
	SM_ID	UNIQUE_ID,
	Obj_ID	UNIQUE_ID,
	ContentPath STRING );
CREATE TABLE SM_PEVT_PROXY (
	     SMevt_ID	UNIQUE_ID,
	     SM_ID	UNIQUE_ID,
	     SMspd_ID	UNIQUE_ID,
	ContentPath STRING );
