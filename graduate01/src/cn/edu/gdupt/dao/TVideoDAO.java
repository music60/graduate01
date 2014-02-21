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

import cn.edu.gdupt.model.TVideo;

/**
 * A data access object (DAO) providing persistence and search support for
 * TVideo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.gdupt.model.TVideo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TVideoDAO {
	private static final Logger log = LoggerFactory.getLogger(TVideoDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String URL = "url";
	public static final String INTRODUCE = "introduce";
	public static final String USERID = "userid";
	public static final String TYPE = "type";
	public static final String LABEL = "label";

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

	public TVideo save(TVideo transientInstance) {
		log.debug("saving TVideo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
			return transientInstance;
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TVideo persistentInstance) {
		log.debug("deleting TVideo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TVideo findById(java.lang.Integer id) {
		log.debug("getting TVideo instance with id: " + id);
		try {
			TVideo instance = (TVideo) getCurrentSession().get(
					"cn.edu.gdupt.model.TVideo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TVideo instance) {
		log.debug("finding TVideo instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("cn.edu.gdupt.model.TVideo")
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
		log.debug("finding TVideo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString =null;
			Query queryObject;
			if (!isAccurate) {
			 queryString = "from TVideo as model where model."
					 + propertyName + " like ?";
			 queryObject = getCurrentSession().createQuery(queryString);
			 queryObject.setParameter(0, "%"+value+"%");
			} else {
				queryString = "from TVideo as model where model."
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

	public List findByTitle(Object title,boolean isAccurate) {
		return findByProperty(TITLE, title,isAccurate);
	}

	public List findByUrl(Object url,boolean isAccurate) {
		return findByProperty(URL, url,isAccurate);
	}

	public List findByIntroduce(Object introduce,boolean isAccurate) {
		return findByProperty(INTRODUCE, introduce,isAccurate);
	}

	public List findByUserid(Object userid,boolean isAccurate) {
		return findByProperty(USERID, userid,isAccurate);
	}

	public List findByType(Object type,boolean isAccurate) {
		return findByProperty(TYPE, type,isAccurate);
	}

	public List findByLabel(Object label,boolean isAccurate) {
		return findByProperty(LABEL, label,isAccurate);
	}

	public List findAll() {
		log.debug("finding all TVideo instances");
		try {
			String queryString = "from TVideo";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TVideo merge(TVideo detachedInstance) {
		log.debug("merging TVideo instance");
		try {
			TVideo result = (TVideo) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TVideo instance) {
		log.debug("attaching dirty TVideo instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TVideo instance) {
		log.debug("attaching clean TVideo instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TVideoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TVideoDAO) ctx.getBean("TVideoDAO");
	}
}