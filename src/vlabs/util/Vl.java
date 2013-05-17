package vlabs.util;
import java.io.*;
import javax.servlet.http.*;

public final class Vl
  {

    /* AUTHENTICATION */
    public static boolean login(String username, String password, HttpSession session)
    {
      /* Verify user/password */
      /* Set session parameters */
      /* Initialize user stuff */
     if(username.equalsIgnoreCase(password))
     {   session.setAttribute("username", username);
         session.setAttribute("acl", "cse01,cse02");
         return true;
     }
     else 
    	 return false;
    }

    public static boolean logout(HttpSession session, HttpServletResponse response) throws IOException
    {
      /* Invalidate session parameters*/
      /* Finalize user stuff*/
      session.setAttribute("username","");
      session.setAttribute("acl","");
      response.sendRedirect("vl_login.jsp");
      return true;
    } 


    /* AUTHORIZATION */
   public static String get_acl(String username)
    {
	  /* Validate if a user is authenticated*/
      /* Get a list of labs authorized to as a csv separated string */
	   return "";
    }

    /* Add a lab to user's acl */
   public static boolean add_acl(String labid)
    {
	   return true;
    }

   /* Remove a lab from user's acl */
   public static boolean del_acl(String labid)
    {
	   return true;
    }


    /* SESSION MANAGEMENT */
    public static String session_validate(HttpSession session, HttpServletResponse response) throws IOException
     {
    	/*Checks session parameters are ok */
    	Object uname=session.getAttribute("username");
    	if(uname==null || uname.toString().equalsIgnoreCase(""))
    	{
    		response.sendRedirect("vl_login.jsp");
    		return null;
    	}
    	return uname.toString();
     }

    public static boolean session_invalidate()
    {
   	/*Removes session parameters*/
   	return true;
    }

    public static boolean session_retrieveInfo()
     {
    	/*Retrieve session-information from persistent storage*/
    	return true;
     }
    
    public static boolean session_saveInfo()
    {
    	/*Save session-information into persistent storage */
        return true;    	
    }
    
    /*AUTOCOMPLETE -INFORMATION*/
    public static String[][] get_autoComplete()
    {
    	/*Retrieves auto-complete information from persistent storage*/
    	return null;
    }
    
    public static boolean set_autoComplete(String[][] info)
    {
    	/*Save auto-complete parameters into persistent storage*/
    	return true;
    }
    
    public static String get_Parameter( String parameter)
    {
    	/* Retrieve a single parameter from persistent storage */
    	return "";
    }
  
    public static boolean set_Parameter(String parameter, String value)
    {
    	/*Save single parameter into persistent storage */
    	return true;
    }
    
    public static String[][] get_labHistory()
    {
    	/* Get labs previously worked on , any past reports, score etc */
    	return null;
    }
    
    public static boolean set_labHistory(String[][] info)
    {
    	/* Save lab history, reports, scores */
    	return true;
    }
    
    /*PERCENTAGE COMPLETION*/
    public static int get_progress()
     {
    	return 50;
     }
    
    public static boolean set_progress(int percentage)
    {
    	return true;
    }
   
    /*RATING*/
    public static boolean set_rating(int rating)
    {
    	return true;
    }
    
    public static int get_rating()
    {
    	return 4;
    }
    
    /*QUIZ-INFORMATION*/
    public static String[][] get_quizItems(int quiz_id, int number)
    {
    	/* Use quiz-id to uniquely identify the instance of the quiz */
    	/* Get a fixed number of items from persistent storage */
    	return null;
    }
    
    public static String[][] get_randomQuizItems(int quiz_id, int number)
    {
    	/* Use quiz-id to uniquely identify the instance of the quiz */
    	/* Get fixed number of items randomly */
    	return null;
    }
    
    public static boolean set_quizItem(String[][] quizItem)
    {
    	/* Admin to add new quiz item */
    	return true;
    }
    
    public static boolean set_quizResults(int quiz_id, String[][] quizResultItem)
    {
    	/* Save user's results of quiz*/
    	/* Evaluate and update appropriate places*/
    	return true;
    }
    
    public static String[][] get_quizResults(int quiz_id)
    {
      /*Retrieve quiz results */
       return null;
    }
    
    /*REPORTING*/
    public static String generate_report()
    {
      /* Generate lab report and return a link based on progress of the lab, rating given, quiz-results etc */
    	return "lab001.pdf";
    }
    
  }
     

    
