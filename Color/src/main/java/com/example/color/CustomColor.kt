package com.example.color

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

class CustomColor {
    companion object{

        fun Red(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mRED= ForegroundColorSpan(Color.RED)
            spannabletext.setSpan(mRED,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Blue(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mBLUE= ForegroundColorSpan(Color.BLUE)
            spannabletext.setSpan(mBLUE,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Green(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mGREEN= ForegroundColorSpan(Color.GREEN)
            spannabletext.setSpan(mGREEN,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Black(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mBLACK= ForegroundColorSpan(Color.BLACK)
            spannabletext.setSpan(mBLACK,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }
        fun Cyan(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mCYAN= ForegroundColorSpan(Color.CYAN)
            spannabletext.setSpan(mCYAN,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }
        fun DarkGray(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mDKGRAY= ForegroundColorSpan(Color.DKGRAY)
            spannabletext.setSpan(mDKGRAY,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }
        fun Gray(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mGRAY= ForegroundColorSpan(Color.GRAY)
            spannabletext.setSpan(mGRAY,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }
        fun LightGray(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mLTGRAY= ForegroundColorSpan(Color.LTGRAY)
            spannabletext.setSpan(mLTGRAY,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Magenta(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mMAGENTA= ForegroundColorSpan(Color.MAGENTA)
            spannabletext.setSpan(mMAGENTA,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Transparent(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mTRANSPARENT= ForegroundColorSpan(Color.TRANSPARENT)
            spannabletext.setSpan(mTRANSPARENT,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun White(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mWHITE= ForegroundColorSpan(Color.WHITE)
            spannabletext.setSpan(mWHITE,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }

        fun Yellow(text:String, start:Int, end:Int,id: TextView){
            val spannabletext= SpannableString(text)
            val mYELLOW= ForegroundColorSpan(Color.YELLOW)
            spannabletext.setSpan(mYELLOW,start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            id.text=spannabletext
        }
    }

}