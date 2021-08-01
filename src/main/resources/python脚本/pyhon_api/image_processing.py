# coding: utf8
import requests
import random

def download_img(img_url, api_token):
    print (img_url)
    header = {"Authorization": "Bearer " + api_token} # 设置http header，视情况加需要的条目，这里的token是用来鉴权的一种方式
    r = requests.get(img_url, headers=header, stream=True)
    print(r.status_code) # 返回状态码
    file_img = 'resource/img.png'

    # file_img = 'resource/'
    print(file_img)
    if r.status_code == 200:
        open(file_img, 'wb').write(r.content) # 将内容写入图片
        print("done")
    del r

    return file_img
# if __name__ == '__main__':
#     # 下载要的图片
#     img_url = "https://z3.ax1x.com/2021/07/27/W5l6Qe.png"
#     api_token = "fklasjfljasdlkfjlasjflasjfljhasdljflsdjflkjsadljfljsda"
#     download_img(img_url, api_token)