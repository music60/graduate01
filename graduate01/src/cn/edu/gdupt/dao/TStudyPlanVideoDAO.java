package cn.edu.gdupt.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.gdupt.model.TStudyPlanVideo;

/**
 * A data access object (DAO) providing persistence and search support for
 * TStudyPlanVideo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.gdupt.model.TStudyPlanVideo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TStudyPlanVideoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TStudyPlanVideoDAO.class);
	// property constants
	public static final String NEED_TIME = "needTime";
	public static final String NOW_TIME = "nowTime";
	public static final String STATUS = "status";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(TStudyPlanVideo transientInstance) {
		log.debug("saving TStudyPlanVideo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TStudyPlanVideo persistentInstance) {
		log.debug("deleting TStudyPlanVideo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TStudyPlanVideo findById(java.lang.Integer id) {
		log.debug("getting TStudyPlanVideo instance with id: " + id);
		try {
			TStudyPlanVideo instance = (TStudyPlanVideo) getCurrentSession()
					.get("cn.edu.gdupt.model.TStudyPlanVideo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TStudyPlanVideo instance) {
		log.debug("finding TStudyPlanVideo instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("cn.edu.gdupt.model.TStudyPlanVideo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TStudyPlanVideo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TStudyPlanVideo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNeedTime(Object needTime) {
		return findByProperty(NEED_TIME, needTime);
	}

	public List findByNowTime(Object nowTime) {
		return findByProperty(NOW_TIME, nowTime);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all TStudyPlanVideo instances");
		try {
			String queryString = "from TStudyPlanVideo";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TStudyPlanVideo merge(TStudyPlanVideo detachedInstance) {
		log.debug("merging TStudyPlanVideo instance");
		try {
			TStudyPlanVideo result = (TStudyPlanVideo) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TStudyPlanVideo instance) {
		log.debug("attaching dirty TStudyPlanVideo instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TStudyPlanVideo instance) {
		log.debug("attaching clean TStudyPlanVideo instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TStudyPlanVideoDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TStudyPlanVideoDAO) ctx.getBean("TStudyPlanVideoDAO");
	}
}