import glob
import sys
import os
import cv2
import numpy as np
import tensorflow as tf
import image_processing

def model_ues(path):
    # 缩放图片大小为100*100
    w = 100
    h = 100

    # 测试图像的地址 （改为自己的）

    # path_test = "resource/test24.jpg"
    api_token = "fklasjfljasdlkfjlasjflasjfljhasdljflsdjflkjsadljfljsda"
    path_test = image_processing.download_img(path,api_token)


    # 创建保存图像的空列表
    imgs = []
    img = cv2.imread(path_test)
    img = cv2.resize(img, (w, h))
    # 将每张经过处理的图像数据保存在之前创建的imgs空列表当中
    imgs.append(img)
    imgs = np.asarray(imgs, np.float32)
    # print("shape of data:",imgs.shape)

    # 导入模型
    model = tf.keras.models.load_model(r"resource/rice_0.93.h5")
    # 创建图像标签列表
    rice_dict = {0: 'Rice blast', 1: 'Rice fleck',
             2: 'Rice koji disease', 3: 'Sheath blight'}

    # 将图像导入模型进行预测
    prediction = model.predict_classes(imgs)
    # prediction = np.argmax(model.predict(imgs), axis=-1)


    # 绘制预测图像
    for i in range(np.size(prediction)):
        # 打印每张图像的预测结果
        print(rice_dict[prediction[i]])
    return rice_dict[prediction[0]]
