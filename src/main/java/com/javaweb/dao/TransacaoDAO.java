package com.javaweb.dao;

import java.util.List;

import com.javaweb.entidades.Transacao;


public interface TransacaoDAO {

  Transacao save(Transacao transacao) throws Exception;

  Transacao edit(Transacao transacao) throws Exception;

  Transacao findById(Long transacaoId) throws Exception;

  void delete(Transacao transacao) throws Exception;

  List<Transacao> list() throws Exception;
}
