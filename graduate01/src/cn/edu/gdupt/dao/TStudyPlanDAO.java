package cn.edu.gdupt.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.gdupt.model.TStudyPlan;
import cn.edu.gdupt.model.TUser;

/**
 * A data access object (DAO) providing persistence and search support for
 * TStudyPlan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.gdupt.model.TStudyPlan
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TStudyPlanDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TStudyPlanDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DECRIBE = "decribe";
	public static final String TYPE = "type";
	public static final String NOW_STUDY = "nowStudy";
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

	public void save(TStudyPlan transientInstance) {
		log.debug("saving TStudyPlan instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TStudyPlan persistentInstance) {
		log.debug("deleting TStudyPlan instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TStudyPlan findById(java.lang.Integer id) {
		log.debug("getting TStudyPlan instance with id: " + id);
		try {
			TStudyPlan instance = (TStudyPlan) getCurrentSession().get(
					"cn.edu.gdupt.model.TStudyPlan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TStudyPlan instance) {
		log.debug("finding TStudyPlan instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("cn.edu.gdupt.model.TStudyPlan")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value,boolean isAccurate) {
		log.debug("finding TStudyPlan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString =null;
			Query queryObject;
			if (!isAccurate) {
				queryString = "from TStudyPlan as model where model."
						+ propertyName + " like ?";
				queryObject = getCurrentSession().createQuery(queryString);
				queryObject.setParameter(0, "%"+value+"%");
			}else {
				queryString = "from TArticle as model where model."
						+ propertyName + "= ?";
				
				queryObject = getCurrentSession().createQuery(queryString);
				queryObject.setParameter(0, value);
			}
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name,boolean isAccurate) {
		return findByProperty(NAME, name,isAccurate);
	}

	public List findByDecribe(Object decribe,boolean isAccurate) {
		return findByProperty(DECRIBE, decribe,isAccurate);
	}

	public List findByType(Object type,boolean isAccurate) {
		return findByProperty(TYPE, type,isAccurate);
	}

	public List findByNowStudy(Object nowStudy,boolean isAccurate) {
		return findByProperty(NOW_STUDY, nowStudy,isAccurate);
	}

	public List findByStatus(Object status,boolean isAccurate) {
		return findByProperty(STATUS, status,isAccurate);
	}

	public List findAll() {
		log.debug("finding all TStudyPlan instances");
		try {
			String queryString = "from TStudyPlan";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TStudyPlan merge(TStudyPlan detachedInstance) {
		log.debug("merging TStudyPlan instance");
		try {
			TStudyPlan result = (TStudyPlan) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TStudyPlan instance) {
		log.debug("attaching dirty TStudyPlan instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TStudyPlan instance) {
		log.debug("attaching clean TStudyPlan instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TStudyPlanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TStudyPlanDAO) ctx.getBean("TStudyPlanDAO");
	}

	public List<TStudyPlan> findByUser(TUser tUser, boolean isAccurate) {
		// TODO Auto-generated method stub
		return null;
	}


}