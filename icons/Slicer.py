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
		rect = iWidth*j,iHeight*i,iWidth*(j+1),iHeight*(i+1)
		if(count>=2):
			if((count-2)/13==0):
				im.crop(rect).save("spades/"+str((count-2)%13+1)+".jpg")
			elif((count-2)/13==1):
				im.crop(rect).save("hearts/"+str((count-2)%13+1)+".jpg")
			elif((count-2)/13==2):
				im.crop(rect).save("clubs/"+str((count-2)%13+1)+".jpg")
			else:	
				im.crop(rect).save("diamonds/"+str((count-2)%13+1)+".jpg")		

				

	
