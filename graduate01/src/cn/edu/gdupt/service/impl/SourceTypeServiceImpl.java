package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TSourceTypeDAO;
import cn.edu.gdupt.model.TSourceType;
import cn.edu.gdupt.service.SourceTypeService;

/**
 * 
 * 资源类型服务 实现
 * 2014-3-1
 * @author wangjj
 *
 */
public class SourceTypeServiceImpl implements SourceTypeService {

	private TSourceTypeDAO tSourceTypeDAO;
	
	public TSourceTypeDAO gettSourceTypeDAO() {
		return tSourceTypeDAO;
	}

	public void settSourceTypeDAO(TSourceTypeDAO tSourceTypeDAO) {
		this.tSourceTypeDAO = tSourceTypeDAO;
	}

	@Override
	public TSourceType addPlanType(TSourceType TSourceType) {
		// TODO Auto-generated method stub
		tSourceTypeDAO.save(TSourceType);
		return null;
	}

	@Override
	public List<TSourceType> findByName(TSourceType TSourceType,
			boolean isAccurate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TSourceType> findByType(String type, boolean isAccurate) {
		// TODO Auto-generated method stub
		return null;
	}

}
