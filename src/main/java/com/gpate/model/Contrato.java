package com.gpate.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="contratos", schema = "gpate")
public class Contrato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="anticipo_contratado")
	private BigDecimal anticipoContratado;

	@Column(name="centro_costo")
	private String centroCosto;

	@Column(name="dias_atencion")
	private Integer diasAtencion;

	@Column(name="dias_programados")
	private Integer diasProgramados;

	@Column(name="dias_vencimiento")
	private String diasVencimiento;

	private String especialidad;

	@Column(name="estimaciones_pagadas")
	private BigDecimal estimacionesPagadas;

	@Column(name="estimaciones_programadas")
	private BigDecimal estimacionesProgramadas;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fallo")
	private Date fechaFallo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_firmado_cliente")
	private Date fechaFirmadoCliente;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_juridico")
	private Date fechaJuridico;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_programada_entrega")
	private Date fechaProgramadaEntrega;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_solicitud_contrato")
	private Date fechaSolicitudContrato;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento_contrato")
	private Date fechaVencimientoContrato;

	private String folio;

	private String hipervinculo;

	@Column(name="importe_contratado")
	private BigDecimal importeContratado;

	private String observaciones;

	@Column(name="pagos_aplicados")
	private BigDecimal pagosAplicados;

	private String proveedor;

	private String proyecto;

	@Column(name="saldo_pendiente_contrato")
	private BigDecimal saldoPendienteContrato;

	@Column(name="status_general")
	private String statusGeneral;

}
