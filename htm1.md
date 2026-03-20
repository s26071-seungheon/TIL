# 1
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>브라우저 윈도우(top)</title></head>
<body>
<h3>2 개의 &lt;frame&gt; 윈도우를 가집니다</h3>
<hr>
	<iframe src="leftframe.html" name= "left"
		     width="100" height="500"></iframe>
	<iframe src=""!DOCTYPE html2.html" name= "right"
		     width="400" height= "500"></iframe>
</body>
</html>

# 2
<!DOCTYPE html>
<html>
<head><meta charset="utf-8">
<title>right iframe</title></head>
<body>
<h4>right iframe</h4>
<hr>
	<iframe src="http://www.etnews.com" name="upper"
		     width="100%" height="200"></iframe>
	<iframe src="http://www.mk.co.kr" name="lower"
		     width="100%" height="200"></iframe>
</body>
</html>

# 3
<!DOCTYPE html>
<html><head><meta charset="utf-8">
<title>target 속성 활용</title></head>
<body>
<h3>target 속성 활용</h3>
<hr>
<iframe src="!DOCTYPE html4" name="left" width="200" height="300">
</iframe>
<iframe src="http://www.mk.co.kr" name"right" width"=200" height="300">
</iframe>
</body>
</html>

# 4
<!DOCTYPE html>
<html>
<head> <meta charset="utf-8">
<title>사이트 리스트</title></head>
<body>
<h4>사이트 리스트</h4>
<ul>
<li><a href="http://www.w3c.org" target="right">W3C</a>
<li><a href="http://www.etnews.com" target="_self">전자신문</a>
<li><a href="http://www.mk.co.kr" target=" _top">매일경제신문</a>
<li><a href="http:/www.w3c.org" target="_blank">새 창에 W3C</a>
</ul>
</body>
</html>

# 5
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>비디오 삽입</title>
</head>
<body>
<h3>비디오 삽입</h3>
<hr>
<video src="여기에 동영상 삽입"
	width="320" height="240" controls>
	브라우저가 video 태그를 지원하지 않습니다.
</video>
</body>
</html>
