import sys
import Image


im = Image.open("cards.jpg")
width,height = im.size
iWidth = width/11
print iWidth
iHeight = height/5
print iHeight

rect = (0,0,iWidth,iHeight)
count = -1 
for i in range(5):
	for j in range(11):
		count += 1
		rect = iWidth*j+20,iHeight*i+20,iWidth*(j+1)-20,iHeight*(i+1)-20
		if(count>=2 and count < 54):
			num = (count-2)%13+1
			if(num==1):
				val = "ace"
			elif(num==11):
				val = "jack"
			elif(num==12):
				val = "queen"
			elif(num==13):
				val = "king"
			else:
				val = str(num)

					 
			if((count-2)/13==0):
				im.crop(rect).save("spades/"+val+".jpg")
			elif((count-2)/13==1):
				im.crop(rect).save("hearts/"+val+".jpg")
			elif((count-2)/13==2):
				im.crop(rect).save("clubs/"+ val+".jpg")
			else:	
				im.crop(rect).save("diamonds/"+val+".jpg")		

				
print count
	
