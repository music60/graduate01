package cn.edu.gdupt.dao;

import java.sql.Timestamp;
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

import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;

/**
 * A data access object (DAO) providing persistence and search support for
 * TArticle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.gdupt.model.TArticle
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TArticleDAO {
	
	public TUserDAO gettUserDAO() {
		return tUserDAO;
	}

	public void settUserDAO(TUserDAO tUserDAO) {
		this.tUserDAO = tUserDAO;
	}

	private TUserDAO tUserDAO;
	private static final Logger log = LoggerFactory
			.getLogger(TArticleDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String TAG = "tag";
	public static final String TYPE = "type";

	
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

	public void save(TArticle transientInstance) {
		log.debug("saving TArticle instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TArticle persistentInstance) {
		log.debug("deleting TArticle instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TArticle findById(java.lang.Integer id) {
		log.debug("getting TArticle instance with id: " + id);
		try {
			TArticle instance = (TArticle) getCurrentSession().get(
					"cn.edu.gdupt.model.TArticle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TArticle instance) {
		log.debug("finding TArticle instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("cn.edu.gdupt.model.TArticle")
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
		log.debug("finding TArticle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString =null;
			Query queryObject;
			if (!isAccurate) {
				queryString = "from TArticle as model where model."
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

	public List findByTitle(Object title,boolean isAccurate) {
		return findByProperty(TITLE, title,isAccurate);
	}

	public List findByContent(Object content,boolean isAccurate) {
		return findByProperty(CONTENT, content,isAccurate);
	}

	public List findByTag(Object tag,boolean isAccurate) {
		return findByProperty(TAG, tag,isAccurate);
	}

	public List findByType(Object type,boolean isAccurate) {
		return findByProperty(TYPE, type,isAccurate);
	}

	public List findAll() {
		log.debug("finding all TArticle instances");
		try {
			String queryString = "from TArticle";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TArticle merge(TArticle detachedInstance) {
		log.debug("merging TArticle instance");
		try {
			TArticle result = (TArticle) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TArticle instance) {
		log.debug("attaching dirty TArticle instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TArticle instance) {
		log.debug("attaching clean TArticle instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TArticleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TArticleDAO) ctx.getBean("TArticleDAO");
	}

	public List<TArticle> findByUser(TUser tUser, boolean b) {
		int userid = tUser.getId();
	findByProperty("TUser.id", userid, true);
	System.out.println(findByProperty("TUser.id", userid, true).size());
		return findByProperty("TUser.id", userid, true);
	}
}