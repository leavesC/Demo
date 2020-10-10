package github.leavesc.demo

import android.os.Bundle
import github.leavesc.base.EasyRouterPath
import github.leavesc.demo.base.BaseActivity
import github.leavesc.demo.easyeventbus.EasyEventBusActivity
import github.leavesc.easyrouter.EasyRouter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 作者：leavesC
 * 时间：2020/10/2 13:14
 * 描述：
 * GitHub：https://github.com/leavesC
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_easyEventBus.setOnClickListener {
            startActivity(EasyEventBusActivity::class.java)
        }
        btn_easyRouter.setOnClickListener {
            EasyRouter.navigation(EasyRouterPath.PATH_HOME)
        }
    }

}