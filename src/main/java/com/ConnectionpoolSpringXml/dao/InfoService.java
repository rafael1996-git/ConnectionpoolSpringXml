package com.ConnectionpoolSpringXml.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ConnectionpoolSpringXml.demo.entity.Usuario;

public class InfoService implements IInfoDao{


	private JdbcTemplate jdbcTemplateuser;

	private JdbcTemplate jdbcTemplatecontrol;

	private JdbcTemplate jdbcTemplatebged01;
	private JdbcTemplate jdbcTemplatebged02;
	private JdbcTemplate jdbcTemplatebged03;
	private JdbcTemplate jdbcTemplatebged04;
	private JdbcTemplate jdbcTemplatebged05;
	private JdbcTemplate jdbcTemplatebged06;

	private JdbcTemplate jdbcTemplatebged07;
	private JdbcTemplate jdbcTemplatebged08;
	private JdbcTemplate jdbcTemplatebged09;
	private JdbcTemplate jdbcTemplatebged10;
	private JdbcTemplate jdbcTemplatebged11;
	private JdbcTemplate jdbcTemplatebged12;
	private JdbcTemplate jdbcTemplatebged13;
	private JdbcTemplate jdbcTemplatebged14;
	private JdbcTemplate jdbcTemplatebged15;
	private JdbcTemplate jdbcTemplatebged16;
	private JdbcTemplate jdbcTemplatebged17;
	private JdbcTemplate jdbcTemplatebged18;
	private JdbcTemplate jdbcTemplatebged19;
	private JdbcTemplate jdbcTemplatebged20;
	private JdbcTemplate jdbcTemplatebged21;
	private JdbcTemplate jdbcTemplatebged22;

	private JdbcTemplate jdbcTemplatebged23;
	private JdbcTemplate jdbcTemplatebged24;
	private JdbcTemplate jdbcTemplatebged25;
	private JdbcTemplate jdbcTemplatebged26;
	private JdbcTemplate jdbcTemplatebged27;
	private JdbcTemplate jdbcTemplatebged28;

	private JdbcTemplate jdbcTemplatebged29;
	private JdbcTemplate jdbcTemplatebged30;
	private JdbcTemplate jdbcTemplatebged31;
	private JdbcTemplate jdbcTemplatebged32;
	private JdbcTemplate jdbcTemplategeoservicios;
	

	public JdbcTemplate getJdbcTemplategeoservicios() {
		return jdbcTemplategeoservicios;
	}

	public void setJdbcTemplategeoservicios(JdbcTemplate jdbcTemplategeoservicios) {
		this.jdbcTemplategeoservicios = jdbcTemplategeoservicios;
	}
	public JdbcTemplate getJdbcTemplateuser() {
		return jdbcTemplateuser;
	}

	public void setJdbcTemplateuser(JdbcTemplate jdbcTemplateuser) {
		this.jdbcTemplateuser = jdbcTemplateuser;
	}

	public JdbcTemplate getJdbcTemplatecontrol() {
		return jdbcTemplatecontrol;
	}

	public void setJdbcTemplatecontrol(JdbcTemplate jdbcTemplatecontrol) {
		this.jdbcTemplatecontrol = jdbcTemplatecontrol;
	}

	public JdbcTemplate getJdbcTemplatebged17() {
		return jdbcTemplatebged17;
	}

	public void setJdbcTemplatebged17(JdbcTemplate jdbcTemplatebged17) {
		this.jdbcTemplatebged17 = jdbcTemplatebged17;
	}

	public JdbcTemplate getJdbcTemplatebged09() {
		return jdbcTemplatebged09;
	}

	public void setJdbcTemplatebged09(JdbcTemplate jdbcTemplatebged09) {
		this.jdbcTemplatebged09 = jdbcTemplatebged09;
	}

	public JdbcTemplate getJdbcTemplatebged14() {
		return jdbcTemplatebged14;
	}

	public void setJdbcTemplatebged14(JdbcTemplate jdbcTemplatebged14) {
		this.jdbcTemplatebged14 = jdbcTemplatebged14;
	}

	public JdbcTemplate getJdbcTemplatebged15() {
		return jdbcTemplatebged15;
	}

	public void setJdbcTemplatebged15(JdbcTemplate jdbcTemplatebged15) {
		this.jdbcTemplatebged15 = jdbcTemplatebged15;
	}

	public JdbcTemplate getJdbcTemplatebged30() {
		return jdbcTemplatebged30;
	}

	public void setJdbcTemplatebged30(JdbcTemplate jdbcTemplatebged30) {
		this.jdbcTemplatebged30 = jdbcTemplatebged30;
	}

	public JdbcTemplate getJdbcTemplatebged01() {
		return jdbcTemplatebged01;
	}

	public void setJdbcTemplatebged01(JdbcTemplate jdbcTemplatebged01) {
		this.jdbcTemplatebged01 = jdbcTemplatebged01;
	}

	public JdbcTemplate getJdbcTemplatebged02() {
		return jdbcTemplatebged02;
	}

	public void setJdbcTemplatebged02(JdbcTemplate jdbcTemplatebged02) {
		this.jdbcTemplatebged02 = jdbcTemplatebged02;
	}

	public JdbcTemplate getJdbcTemplatebged03() {
		return jdbcTemplatebged03;
	}

	public void setJdbcTemplatebged03(JdbcTemplate jdbcTemplatebged03) {
		this.jdbcTemplatebged03 = jdbcTemplatebged03;
	}

	public JdbcTemplate getJdbcTemplatebged04() {
		return jdbcTemplatebged04;
	}

	public void setJdbcTemplatebged04(JdbcTemplate jdbcTemplatebged04) {
		this.jdbcTemplatebged04 = jdbcTemplatebged04;
	}

	public JdbcTemplate getJdbcTemplatebged05() {
		return jdbcTemplatebged05;
	}

	public void setJdbcTemplatebged05(JdbcTemplate jdbcTemplatebged05) {
		this.jdbcTemplatebged05 = jdbcTemplatebged05;
	}

	public JdbcTemplate getJdbcTemplatebged06() {
		return jdbcTemplatebged06;
	}

	public void setJdbcTemplatebged06(JdbcTemplate jdbcTemplatebged06) {
		this.jdbcTemplatebged06 = jdbcTemplatebged06;
	}

	public JdbcTemplate getJdbcTemplatebged07() {
		return jdbcTemplatebged07;
	}

	public void setJdbcTemplatebged07(JdbcTemplate jdbcTemplatebged07) {
		this.jdbcTemplatebged07 = jdbcTemplatebged07;
	}

	public JdbcTemplate getJdbcTemplatebged08() {
		return jdbcTemplatebged08;
	}

	public void setJdbcTemplatebged08(JdbcTemplate jdbcTemplatebged08) {
		this.jdbcTemplatebged08 = jdbcTemplatebged08;
	}

	public JdbcTemplate getJdbcTemplatebged10() {
		return jdbcTemplatebged10;
	}

	public void setJdbcTemplatebged10(JdbcTemplate jdbcTemplatebged10) {
		this.jdbcTemplatebged10 = jdbcTemplatebged10;
	}

	public JdbcTemplate getJdbcTemplatebged11() {
		return jdbcTemplatebged11;
	}

	public void setJdbcTemplatebged11(JdbcTemplate jdbcTemplatebged11) {
		this.jdbcTemplatebged11 = jdbcTemplatebged11;
	}

	public JdbcTemplate getJdbcTemplatebged12() {
		return jdbcTemplatebged12;
	}

	public void setJdbcTemplatebged12(JdbcTemplate jdbcTemplatebged12) {
		this.jdbcTemplatebged12 = jdbcTemplatebged12;
	}

	public JdbcTemplate getJdbcTemplatebged13() {
		return jdbcTemplatebged13;
	}

	public void setJdbcTemplatebged13(JdbcTemplate jdbcTemplatebged13) {
		this.jdbcTemplatebged13 = jdbcTemplatebged13;
	}

	public JdbcTemplate getJdbcTemplatebged16() {
		return jdbcTemplatebged16;
	}

	public void setJdbcTemplatebged16(JdbcTemplate jdbcTemplatebged16) {
		this.jdbcTemplatebged16 = jdbcTemplatebged16;
	}

	public JdbcTemplate getJdbcTemplatebged18() {
		return jdbcTemplatebged18;
	}

	public void setJdbcTemplatebged18(JdbcTemplate jdbcTemplatebged18) {
		this.jdbcTemplatebged18 = jdbcTemplatebged18;
	}

	public JdbcTemplate getJdbcTemplatebged19() {
		return jdbcTemplatebged19;
	}

	public void setJdbcTemplatebged19(JdbcTemplate jdbcTemplatebged19) {
		this.jdbcTemplatebged19 = jdbcTemplatebged19;
	}

	public JdbcTemplate getJdbcTemplatebged20() {
		return jdbcTemplatebged20;
	}

	public void setJdbcTemplatebged20(JdbcTemplate jdbcTemplatebged20) {
		this.jdbcTemplatebged20 = jdbcTemplatebged20;
	}

	public JdbcTemplate getJdbcTemplatebged21() {
		return jdbcTemplatebged21;
	}

	public void setJdbcTemplatebged21(JdbcTemplate jdbcTemplatebged21) {
		this.jdbcTemplatebged21 = jdbcTemplatebged21;
	}

	public JdbcTemplate getJdbcTemplatebged22() {
		return jdbcTemplatebged22;
	}

	public void setJdbcTemplatebged22(JdbcTemplate jdbcTemplatebged22) {
		this.jdbcTemplatebged22 = jdbcTemplatebged22;
	}

	public JdbcTemplate getJdbcTemplatebged23() {
		return jdbcTemplatebged23;
	}

	public void setJdbcTemplatebged23(JdbcTemplate jdbcTemplatebged23) {
		this.jdbcTemplatebged23 = jdbcTemplatebged23;
	}

	public JdbcTemplate getJdbcTemplatebged24() {
		return jdbcTemplatebged24;
	}

	public void setJdbcTemplatebged24(JdbcTemplate jdbcTemplatebged24) {
		this.jdbcTemplatebged24 = jdbcTemplatebged24;
	}

	public JdbcTemplate getJdbcTemplatebged25() {
		return jdbcTemplatebged25;
	}

	public void setJdbcTemplatebged25(JdbcTemplate jdbcTemplatebged25) {
		this.jdbcTemplatebged25 = jdbcTemplatebged25;
	}

	public JdbcTemplate getJdbcTemplatebged26() {
		return jdbcTemplatebged26;
	}

	public void setJdbcTemplatebged26(JdbcTemplate jdbcTemplatebged26) {
		this.jdbcTemplatebged26 = jdbcTemplatebged26;
	}

	public JdbcTemplate getJdbcTemplatebged27() {
		return jdbcTemplatebged27;
	}

	public void setJdbcTemplatebged27(JdbcTemplate jdbcTemplatebged27) {
		this.jdbcTemplatebged27 = jdbcTemplatebged27;
	}

	public JdbcTemplate getJdbcTemplatebged28() {
		return jdbcTemplatebged28;
	}

	public void setJdbcTemplatebged28(JdbcTemplate jdbcTemplatebged28) {
		this.jdbcTemplatebged28 = jdbcTemplatebged28;
	}

	public JdbcTemplate getJdbcTemplatebged29() {
		return jdbcTemplatebged29;
	}

	public void setJdbcTemplatebged29(JdbcTemplate jdbcTemplatebged29) {
		this.jdbcTemplatebged29 = jdbcTemplatebged29;
	}

	public JdbcTemplate getJdbcTemplatebged31() {
		return jdbcTemplatebged31;
	}

	public void setJdbcTemplatebged31(JdbcTemplate jdbcTemplatebged31) {
		this.jdbcTemplatebged31 = jdbcTemplatebged31;
	}

	public JdbcTemplate getJdbcTemplatebged32() {
		return jdbcTemplatebged32;
	}

	public void setJdbcTemplatebged32(JdbcTemplate jdbcTemplatebged32) {
		this.jdbcTemplatebged32 = jdbcTemplatebged32;
	}

	@Override
	public List<Usuario> GetAll()  {
		String sql = "SELECT * FROM public.usuario ";
		
		List<Usuario> list = jdbcTemplatecontrol.query(sql, new RowMapper<Usuario>() {

			@Override
			public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
				Usuario user = new Usuario();
				user.setId_usuario(rs.getInt("id_usuario"));
				user.setNombre(rs.getString("nombre"));
				user.setApe_pat(rs.getString("ape_pat"));
				user.setApe_mat(rs.getString("ape_mat"));
				user.setPuesto(rs.getString("puesto"));
				user.setEntidad(rs.getInt("entidad"));
				user.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
				user.setCorreo(rs.getString("correo"));
				user.setPassword(rs.getString("password"));

				return user;
			}

		});

		return list;
	}


}
