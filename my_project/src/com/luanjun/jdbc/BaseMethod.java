package com.luanjun.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BaseMethod {

	public Map<String, Object> selectMap(String sql) throws SQLException;

	public Map<String, Object> selectMapPrepare(String sql, Object... paramArgs) throws SQLException;

	public List<Map<String, Object>> selectList(String sql) throws SQLException;

	public List<Map<String, Object>> selectListPrepare(String sql, Object... paramArgs) throws SQLException;

	public int update(String sql) throws SQLException;

	public int updatePrepare(String sql, Object... paramArgs) throws SQLException;

	public int insert(String sql) throws SQLException;

	public int insertPrepare(String sql, Object... paramArgs) throws SQLException;

	public int insertPrepareGetKey(String sql, Object... paramArgs) throws SQLException;

	public int delete(String sql) throws SQLException;

	public int deletePrepare(String sql, Object... paramArgs) throws SQLException;

	public int selectNumOne(String sql) throws SQLException;

	public int selectNumOnePrepare(String sql, Object... paramArgs) throws SQLException;

	public List<Integer> selectNumList(String sql) throws SQLException;

	public List<Integer> selectNumListPrepare(String sql, Object... paramArgs) throws SQLException;

	public double selectDoubleOne(String sql) throws SQLException;

	public double selectDoubleOnePrepare(String sql, Object... paramArgs) throws SQLException;

	public List<Double> selectDoubleList(String sql) throws SQLException;

	public List<Double> selectDoubleListPrepare(String sql, Object... paramArgs) throws SQLException;

	public String selectStringOne(String sql) throws SQLException;

	public String selectStringOnePrepare(String sql, Object... paramArgs) throws SQLException;

	public List<String> selectStringList(String sql) throws SQLException;

	public List<String> selectStringListPrepare(String sql, Object... paramArgs) throws SQLException;
}
