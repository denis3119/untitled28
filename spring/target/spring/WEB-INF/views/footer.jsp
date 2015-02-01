<%--
  Created by IntelliJ IDEA.
  User: denik
  Date: 01.02.2015
  Time: 6:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

 <hr>
  <footer class="row">
    <div class="col-md-6"> <p>&copy;</p> </div>
    <div class="col-md-3">

      <select onchange="" name="lang" class="form-control">
        <option disabled selected>@Resource.Lang</option>
        <option value="ru">Русский</option>
        <option value="en">English</option>
      </select>
      <input hidden="hidden" type="submit" id="langchange" name="submit" class="btn hidden btn-default" value="@Resource.Lang">
      }


    </div>

    <div class="col-md-3">

      <select onchange="$('#themeChange').click()" name="them" class="form-control">
        <option disabled selected>@Resource.Themes</option>
        <option value="css">Original</option>
        <option value="css2">Blue</option>
      </select>
      <input hidden="hidden" type="submit" id="themeChange" name="submit" class="btn hidden btn-default" value="@Resource.Lang">
      }


    </div>
  </footer>
