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
		rect2 = rect[0],rect[1],rect[0]+100,rect[3]
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

			crop = im.crop(rect)		
			crop2 = im.crop(rect2)	 
			w,h = crop.size
			w2,h2 = crop2.size
			crop = crop.resize((w/4,h/4))
			crop2 = crop2.resize((w2/4,h2/4))
			if((count-2)/13==0):
				crop.save("spades/"+val+".jpg")
				crop2.save("spades/"+val+"S.jpg")
			elif((count-2)/13==1):
				crop.save("hearts/"+val+".jpg")
				crop2.save("hearts/"+val+"S.jpg")
			elif((count-2)/13==2):
				crop.save("clubs/"+ val+".jpg")
				crop2.save("clubs/"+val+"S.jpg")
			else:	
				crop.save("diamonds/"+val+".jpg")
				crop2.save("diamonds/"+val+"S.jpg")		

				
print count
	
