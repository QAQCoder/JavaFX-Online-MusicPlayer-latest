package entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * 歌单下的音乐列表
 */
public class SongListContains extends SongListEntityParent  implements Serializable {
    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * list : {"list":{"timestamp":1550824517,"info":[{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4747981,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7214975},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"周杰伦 - 不能说的秘密","price_320":200,"extname":"mp3","hash":"6859F85541A3D58FA441D7B4B3E64F38","mvhash":"BC13EEFDC007D14C1FAC9A1045D57191","privilege":8,"album_id":"1737923","sqprivilege":10,"320privilege":10,"album_audio_id":39564288,"rp_type":"audio","320filesize":11864815,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":316495,"remark":"《不能说的秘密》电影插曲","pkg_price_320":1,"fail_process":4,"sqhash":"453A2C813A5919F81AF81AC527E44EDD","duration":296,"sqfilesize":33431251,"pay_type_sq":3,"fail_process_sq":4,"brief":"说出口恐怕连守护都无法继续，只能缄默如初，在回忆里打转，永远保守这个秘密。","topic_url_320":"","320hash":"43A000A7F3EB9AB91CBB59673015ECFA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4725072,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4953191},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张悬 - 关于我爱你","price_320":200,"extname":"mp3","hash":"C2DDE35B0FC3C3BEA72FB85A28EF8C74","mvhash":"354CA5AC3D5682EEE68BE5A54C550654","privilege":8,"album_id":"978383","sqprivilege":10,"320privilege":10,"album_audio_id":32203674,"rp_type":"audio","320filesize":11822151,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":17602,"remark":"《失恋33天》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"DEAEBB68A2AEF69BFFB1EED6AAB654BB","duration":295,"sqfilesize":32700597,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱上你已是最大的侥幸，张悬温暖又清澈的声音道出了爱情晦涩的真理。","topic_url_320":"","320hash":"52A617F29853684F89AAEC3AAD98FAA1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3059460,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":23063908},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王菲 - 爱不可及","price_320":200,"extname":"mp3","hash":"8754D1E884B89B62B042F6AF74B4B12B","mvhash":"37BD3394B3FCFD0AEA5A3BF4FBBA8894","privilege":8,"album_id":"540356","sqprivilege":10,"320privilege":10,"album_audio_id":27740596,"rp_type":"audio","320filesize":7647607,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":4222175,"remark":"《触不可及》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"BB38684600513DF6C78DB6E32F77B9EE","duration":191,"sqfilesize":20542871,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱不可及四个字是历经周折后最无奈的自语，王菲回首往事，空灵之余是缺憾。","topic_url_320":"","320hash":"3BD4E5E0C1B2E72BB27EC71C85ED6E79"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4966993,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7212601},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"范玮琪 - 到不了","price_320":200,"extname":"mp3","hash":"F5DD826A06C5F9CDF6EC9E9B77D78F5E","mvhash":"6458A6783957CA029FB54743C9E21889","privilege":8,"album_id":"960621","sqprivilege":10,"320privilege":10,"album_audio_id":32044731,"rp_type":"audio","320filesize":12453093,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":173456,"remark":"最初的梦想","pkg_price_320":1,"fail_process":4,"sqhash":"8AAB653C7F889B66EF0C74580EF857B6","duration":310,"sqfilesize":32526131,"pay_type_sq":3,"fail_process_sq":4,"brief":"天高可以飞翔，遇水可以架桥，而你的心我始终到不了。范范通透的嗓音有隐忍的心酸。","topic_url_320":"","320hash":"12EA76A959ABB8C89597D80E30A5FB78"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3067948,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31973108},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡健雅 - 与你无关","price_320":200,"extname":"mp3","hash":"CB7CE1753BFE34D33E8F1F96E5806FE3","mvhash":"4B06A626776869C4B6AE3B11AD0AFC53","privilege":8,"album_id":"982412","sqprivilege":10,"320privilege":10,"album_audio_id":32241351,"rp_type":"audio","320filesize":7585200,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":101919,"remark":"呼吸","pkg_price_320":1,"fail_process":4,"sqhash":"E0FA10133E2F856BF63A08E633D8327C","duration":191,"sqfilesize":18069276,"pay_type_sq":3,"fail_process_sq":4,"brief":"这是蔡健雅早期的作品，由林夕填词。倔强的唱着与你无关，一切了然。","topic_url_320":"","320hash":"D899905E61BEBF5F6AD2360E4D914D9A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4403744,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7343652},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨宗纬 - 那个男人","price_320":200,"extname":"mp3","hash":"A6878F84CDF33A22141B3356294CEDC8","mvhash":"92BE6616DEA95356C22A72EB3DBF806C","privilege":8,"album_id":"958957","sqprivilege":10,"320privilege":10,"album_audio_id":32029839,"rp_type":"audio","320filesize":10900081,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12911,"remark":"《그남자》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"634DF26E1442B81498148432B300CD91","duration":275,"sqfilesize":29224848,"pay_type_sq":3,"fail_process_sq":4,"brief":"杨宗纬的哭腔最适合表达爱而不得的苦楚。默默爱着的人需要多久才会被知晓?","topic_url_320":"","320hash":"E69BEAEF04F8219878068DFC0FE4042A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4461290,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952548},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏 - 你不知道的事","price_320":200,"extname":"mp3","hash":"834547CEABC6E788FF4555ED5BB77101","mvhash":"ED4DC0884410795D40071231DA454724","privilege":8,"album_id":"982128","sqprivilege":10,"320privilege":10,"album_audio_id":32238945,"rp_type":"audio","320filesize":11152398,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":336735,"remark":"《恋爱通告》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"77B640D1393FC149F5B8333082F054DD","duration":279,"sqfilesize":29922641,"pay_type_sq":3,"fail_process_sq":4,"brief":"万事奇妙，我也很奇怪怎么会沦陷于你，我们都不知道恋爱这件事走向何处。","topic_url_320":"","320hash":"1D41B0AA7ADDF62527D7375E11055426"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4014201,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31823486},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张靓颖 - 个人秘密","price_320":200,"extname":"mp3","hash":"E42A47692AB268DC9DD025E883709D3A","mvhash":"C1AABA4129D276DF719AEE514E71686B","privilege":8,"album_id":"1077480","sqprivilege":10,"320privilege":10,"album_audio_id":33145285,"rp_type":"audio","320filesize":10036435,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12998,"remark":"张靓颖 2007北京演唱会","pkg_price_320":1,"fail_process":4,"sqhash":"286CBD45D938A9D58818988222C6B4D6","duration":250,"sqfilesize":29631195,"pay_type_sq":3,"fail_process_sq":4,"brief":"张靓颖唱出放手的那个人的心声，晚爱一步，有多懂事就有多寂寥。","topic_url_320":"","320hash":"22DB23E3871CAC17B9DB3E82528B7155"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":5284803,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":46257697},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"许茹芸 - 如果云知道","price_320":200,"extname":"mp3","hash":"0D7A3DCE91F2CDCA1F6FEDC38491FA02","mvhash":"7A4480B0F68203A3A4DB5AB46DDD288E","privilege":8,"album_id":"885853","sqprivilege":10,"320privilege":10,"album_audio_id":31302797,"rp_type":"audio","320filesize":13122344,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":348615,"remark":"青梅竹马101","pkg_price_320":1,"fail_process":4,"sqhash":"C742677FA968A04F65542680B6B79C41","duration":330,"sqfilesize":35949226,"pay_type_sq":3,"fail_process_sq":4,"brief":"许茹芸的歌声也如云，飘飘悠悠。云听得到，但更希望你会听到。","topic_url_320":"","320hash":"140C76F22D752BDCCA6DA88C298E3C5D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4010560,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7204837},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"G.E.M.邓紫棋 - 我的秘密","price_320":200,"extname":"mp3","hash":"EBE4738C734C89C2CCF48DC4D1737407","mvhash":"E69575BDAB79FA74B16378BA38B94B0C","privilege":8,"album_id":"976561","sqprivilege":10,"320privilege":10,"album_audio_id":32186878,"rp_type":"audio","320filesize":10007244,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":50102,"remark":"My Secret","pkg_price_320":1,"fail_process":4,"sqhash":"894648BBECF179C5DEA6C54954738296","duration":250,"sqfilesize":30250382,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋也不都是苦涩的，邓紫棋的这首歌里有萌生爱意时的喜悦，也期待秘密被发现。","topic_url_320":"","320hash":"3C1E1D3468AAB34E6EEE25FD24A779DA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3400559,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32678654},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"房东的猫 - 你是我最愚蠢的一次浪漫","price_320":200,"extname":"mp3","hash":"D4E0CF30B40813B3625BC5CB2F0ACA34","mvhash":"","privilege":8,"album_id":"8445681","sqprivilege":10,"320privilege":10,"album_audio_id":108461617,"rp_type":"audio","320filesize":8796201,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":27964539,"remark":"柔软","pkg_price_320":1,"fail_process":4,"sqhash":"CEB4414640A178193365FF8B70B3B5A0","duration":212,"sqfilesize":21042129,"pay_type_sq":3,"fail_process_sq":4,"brief":"不争不抢似乎总是受伤，懊悔自己的愚蠢却还是觉得不枉一次浪漫。","topic_url_320":"","320hash":"872B2905B26FE48D410C071B697DED93"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3925889,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":37261491},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"张杰 - 他不懂 (Live)","price_320":0,"extname":"mp3","hash":"44AE03FF48CB725D9E7F3CE23EEE40F5","mvhash":"","privilege":8,"album_id":"1004310","sqprivilege":0,"320privilege":0,"album_audio_id":32444791,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2557021,"remark":"我是歌手第二季 双年巅峰会","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":245,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"被爱的人都有恃无恐，他不懂，也不愿意去懂对方没说出口的是什么。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4143962,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":30274296},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"姚贝娜 - 矜持","price_320":200,"extname":"mp3","hash":"92B893ED081B01E01C256CFE6CAA9D57","mvhash":"2EF623EE812182923E2BB584DD9DAEA2","privilege":8,"album_id":"558965","sqprivilege":10,"320privilege":10,"album_audio_id":28154934,"rp_type":"audio","320filesize":10363468,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2505359,"remark":"《前任攻略》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"C315C274F5498C0B45660612A7DA2F18","duration":258,"sqfilesize":31625259,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道不会被你爱上，我也不后悔付过出我真心，即使是抛弃矜贵的代价。","topic_url_320":"","320hash":"3321B680EB4608E40EC7F83B2262F667"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":2668378,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997036},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏、任家萱 - 你是我心内的一首歌","price_320":200,"extname":"mp3","hash":"706C25F9CCF316FF68371E16DC788DCE","mvhash":"B6629A4988E9A88616D73BC6222F7FCA","privilege":8,"album_id":"526409","sqprivilege":10,"320privilege":10,"album_audio_id":27581574,"rp_type":"audio","320filesize":6671863,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":717298,"remark":"大马Music Man纪念精选辑","pkg_price_320":1,"fail_process":4,"sqhash":"CA4C81FA86AD16920831CCD715D2BE8D","duration":166,"sqfilesize":19595839,"pay_type_sq":3,"fail_process_sq":4,"brief":"或许暗恋有甜蜜，互相暗恋的两个人，都不愿说出口，但在心里早已响起爱歌。","topic_url_320":"","320hash":"23EAECA9A0A05A99BF9A5996638586F0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3532810,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464587},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"金莎 - 我知道我们不会有结果","price_320":200,"extname":"mp3","hash":"1ABFE2DAC7446228A98A000FFC08CBA0","mvhash":"5C7A2E5B690B0A20E9BB8F6C9BB7EB25","privilege":8,"album_id":"963944","sqprivilege":10,"320privilege":10,"album_audio_id":32075082,"rp_type":"audio","320filesize":8933029,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":47892,"remark":"《안 행복해》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"B6444AF20AC3C6BA92F72F8DF135AAE5","duration":220,"sqfilesize":26144808,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道你是深渊，你是毒药，可还是义无反顾，毫无保留，也许唯一结果便是放手祝福。","topic_url_320":"","320hash":"2064739B08CB73C6E1F0B259EAFC4321"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3195714,"bitrate":129,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":18600730},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"林俊杰 - 期待你的爱","price_320":0,"extname":"mp3","hash":"8892E00C1666F5AD0725F8EF0B83534F","mvhash":"","privilege":8,"album_id":"1507385","sqprivilege":0,"320privilege":0,"album_audio_id":61767842,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":147232,"remark":"《原来我不帅》电视剧片尾曲","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":199,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"每个人都有爱的权利，都有期待被爱的渴求，林俊杰告诉你沉默不如放手去爱。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3737381,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997111},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡淳佳 - 依恋","price_320":200,"extname":"mp3","hash":"BD240D1EC4A601BC783F12BE31B9658A","mvhash":"0AC678887159BA043EF95043131D6673","privilege":8,"album_id":"559315","sqprivilege":10,"320privilege":10,"album_audio_id":28159136,"rp_type":"audio","320filesize":9341573,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":174326,"remark":"《Je m'appelle Hélène》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"BE5E7EA9806AC0E8B403A972912A8C75","duration":233,"sqfilesize":26461934,"pay_type_sq":3,"fail_process_sq":4,"brief":"你像秋千，我只好做原点，来捕捉你的片刻停留，只为多一分对你的依恋。","topic_url_320":"","320hash":"3989263C2B3E481871A8462ADD678AB7"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4227082,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"林宥嘉 - 说谎 (Live)","price_320":0,"extname":"mp3","hash":"95FEB4D752874A9277761F0FDF92858D","mvhash":"","privilege":0,"album_id":"1737824","sqprivilege":0,"320privilege":0,"album_audio_id":39562257,"rp_type":"audio","320filesize":10538007,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":328354,"remark":"坚强的背后","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":263,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"《 说谎》是林宥嘉刚出道不久的作品，那时的林宥嘉唱腔满含真情，一个最不会说谎的声音为爱隐瞒太多心事。","topic_url_320":"","320hash":"51B14739092E8A78E83C27089C91A31A"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4955833,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"蓝又时 - 秘密","price_320":0,"extname":"mp3","hash":"9602AB6E441DF1E96FE4552B6ABA8546","mvhash":"F546A073EE6C0313B0527A0D9B2EC169","privilege":0,"album_id":"2300492","sqprivilege":0,"320privilege":0,"album_audio_id":88065989,"rp_type":"audio","320filesize":12312202,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":185129,"remark":"穿越音乐时光 写情歌的女人","pkg_price_320":0,"fail_process":0,"sqhash":"5EFA987F32EF59EC18D7A23A3E5CF216","duration":307,"sqfilesize":31937913,"pay_type_sq":0,"fail_process_sq":0,"brief":"爱一个人最开始和最终的状态，都是缘起于秘密，开始是不愿提起，结束时是不能提起。","topic_url_320":"","320hash":"C9E6C88A24FA115D40EAAFFDEF7D5CA0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4244418,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32485916},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"孙伯纶 - 口是心非","price_320":200,"extname":"mp3","hash":"ABE9D0EFD958F3B61DD3776D0AFE4F86","mvhash":"","privilege":8,"album_id":"1597443","sqprivilege":10,"320privilege":10,"album_audio_id":38258938,"rp_type":"audio","320filesize":10595781,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":95230,"remark":"痛在爱的边缘Ⅱ:残酷的温柔","pkg_price_320":1,"fail_process":4,"sqhash":"788E0D3CFE530DEFF41F5DFA4F0B7DBB","duration":264,"sqfilesize":32886158,"pay_type_sq":3,"fail_process_sq":4,"brief":"孙伯纶很适合诠释不善言辞的男子形象，明明爱意在心，口却难开，变得物是人非。","topic_url_320":"","320hash":"713A41B96AEFD2DFBC0A8F710C592C36"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4515157,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5114901},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"萧亚轩 - 类似爱情","price_320":200,"extname":"mp3","hash":"D4E095ED4617FBE238F22DE8907845EE","mvhash":"DA20FC9D4688900234F00A06AD704029","privilege":8,"album_id":"521727","sqprivilege":10,"320privilege":10,"album_audio_id":27531651,"rp_type":"audio","320filesize":11278791,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":245858,"remark":"Super Girl 爱无畏","pkg_price_320":1,"fail_process":4,"sqhash":"36849CF0C6D6BE6ADBC9B7ED28BE9F0D","duration":282,"sqfilesize":29963046,"pay_type_sq":3,"fail_process_sq":4,"brief":"这首歌适合表达所有不便说出口的禁忌之恋，类似于爱情的回应就已经足够了。","topic_url_320":"","320hash":"DB26342C3C6BC93D239966C27497B571"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4300598,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":34191781},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"张智成 - 暗恋","price_320":0,"extname":"mp3","hash":"9603D35C3419292CEC14486E761F09DA","mvhash":"FBD94A8CC2270CAB5F0B966388CD2CBC","privilege":0,"album_id":"970960","sqprivilege":0,"320privilege":0,"album_audio_id":32137250,"rp_type":"audio","320filesize":10756360,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":160094,"remark":"暗恋","pkg_price_320":0,"fail_process":0,"sqhash":"ABAC7A034B205048298250214BD42DF6","duration":268,"sqfilesize":31453265,"pay_type_sq":0,"fail_process_sq":0,"brief":"跨过那道边界，不确定是靠近还是遥远，所以只能躲进好朋友的身份里继续爱着。","topic_url_320":"","320hash":"ED91122C6D1CE27167F280B4B4E579C8"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4690164,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32198664},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"板蓝根_Ryan - 你怎么蠢到我喜欢你都不知道","price_320":0,"extname":"mp3","hash":"1FFBEABC5215E5150AD62AB5F4CDBB4B","mvhash":"","privilege":0,"album_id":"8348783","sqprivilege":0,"320privilege":0,"album_audio_id":106262601,"rp_type":"audio","320filesize":11725044,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":36945347,"remark":"你怎么蠢到我喜欢你都不知道","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":293,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"你怎么蠢到我喜欢你都不知道？即使全世界都知道，也败给一个人的装聋作哑，视而不见，如此也便有了幽怨。","topic_url_320":"","320hash":"080494182401C6E8CD3AE4D0AD472B91"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4208376,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952603},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨丞琳 - 匿名的好友","price_320":200,"extname":"mp3","hash":"1C2297E5C24E05F7361A68DAA603E2AD","mvhash":"FBDF9B5871AA8E76B1FE44830EA01729","privilege":8,"album_id":"977004","sqprivilege":10,"320privilege":10,"album_audio_id":64500226,"rp_type":"audio","320filesize":10517129,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":251083,"remark":"《灿烂的遗产》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"8F12CDC77D301F84DB27F60C9C9BDF79","duration":262,"sqfilesize":28439384,"pay_type_sq":3,"fail_process_sq":4,"brief":"听完《匿名的好友》，似乎懂得：所有如果都没有结果，但悸动还在，只能隐姓埋名，做你最隐秘的好友 。","topic_url_320":"","320hash":"C1E36BBE2D46D9403BD593978B7436E9"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4118538,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464091},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"棉花糖 - 请帮我爱他","price_320":200,"extname":"mp3","hash":"70E519B3EE2BC6E985645679C4274584","mvhash":"AAAEAF9EF17827607B6899F265CEE73C","privilege":8,"album_id":"561198","sqprivilege":10,"320privilege":10,"album_audio_id":28185836,"rp_type":"audio","320filesize":10192061,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":64915,"remark":"小飞行","pkg_price_320":1,"fail_process":4,"sqhash":"13B624147B240BD4235CF04367A5D010","duration":254,"sqfilesize":29499514,"pay_type_sq":3,"fail_process_sq":4,"brief":"有一种爱叫做放手，一个人的相思好过三个人的纠缠难过。","topic_url_320":"","320hash":"BDB6CE1D302B139ABD19360A46A14EE1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3558547,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32480371},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"刘若英 - 知道不知道?","price_320":200,"extname":"mp3","hash":"DA6A7E19051E9D691762886851114841","mvhash":"2FA7D579BF04D2A838E94D7E2D763414","privilege":8,"album_id":"971958","sqprivilege":10,"320privilege":10,"album_audio_id":32145932,"rp_type":"audio","320filesize":8844233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":345132,"remark":"《天下无贼》片尾曲","pkg_price_320":1,"fail_process":4,"sqhash":"79A190DCD81C80F845AB3B8B1473739B","duration":222,"sqfilesize":21175421,"pay_type_sq":3,"fail_process_sq":4,"brief":"奶茶的歌里就算有伤感，也是泛着热气的。关于暗恋，知道还是不知道，我心明了。","topic_url_320":"","320hash":"11B1636B3ECDD587AD24595FBF225D7D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4771003,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5113276},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"陶喆 - 暗恋","price_320":200,"extname":"mp3","hash":"1B2C7CB1A3BB84BF41582A341C70B4D9","mvhash":"1527E2F763FC9398101A593E2BFF69DB","privilege":8,"album_id":"979261","sqprivilege":10,"320privilege":10,"album_audio_id":32212276,"rp_type":"audio","320filesize":11971565,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":5225,"remark":"69乐章","pkg_price_320":1,"fail_process":4,"sqhash":"CD23908D75F41D4C84654F75A7DB955D","duration":298,"sqfilesize":31068360,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋是创作才子们永恒的话题，在陶喆的歌里苦涩的暗恋又多了一分浪漫和洒脱。","topic_url_320":"","320hash":"B947C5978CEDF346F0FE9494BC25DCEA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":0,"filesize":5166504,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4950121},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"卢学睿 - 可不可以爱我","price_320":200,"extname":"mp3","hash":"0CB87F37FD828ECE22E72873C5EF01BA","mvhash":"7F791C3FE5F2E500424C5F656C779700","privilege":8,"album_id":"555831","sqprivilege":0,"320privilege":10,"album_audio_id":28117779,"rp_type":"audio","320filesize":12796018,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":716155,"remark":"hitto!!超人气偶像剧主题曲精选","pkg_price_320":1,"fail_process":4,"sqhash":"","duration":319,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"卢学睿的歌里有孩子般的执拗，每一个暗恋中的人都会困惑，究竟要怎么做才会得到爱的回音。","topic_url_320":"","320hash":"A293B5EC455E3B030FA55C1D88E2207D"},{"pay_type_320":1,"m4afilesize":0,"price_sq":200,"filesize":4149124,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32008978},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":1,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"丛铭君 - 听说","price_320":200,"extname":"mp3","hash":"D4758F2973BE3CC7E89C62F432BE9583","mvhash":"9E4C74CC22748A73CEC7044555F22825","privilege":8,"album_id":"4040155","sqprivilege":10,"320privilege":10,"album_audio_id":88246147,"rp_type":"audio","320filesize":10372746,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":28474961,"remark":"听说","pkg_price_320":1,"fail_process":4,"sqhash":"6A7656B0B3DB8806EB0DA0F75BE36B5D","duration":259,"sqfilesize":27299769,"pay_type_sq":1,"fail_process_sq":4,"brief":"丛铭君的《听说》表达了一种恍若隔世的暗恋：时隔多年，当初偷偷爱着的那个人，也渐渐成了别人口中的听说。","topic_url_320":"","320hash":"934D4C5B35AC56A7A3228F6A2279C89F"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3299229,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":13944677},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王俞匀 - 全世界的人都知道","price_320":200,"extname":"mp3","hash":"F1AB637FC78F89D431207631357CA12F","mvhash":"4D5D5B04AB292F26868ABA47FCA99529","privilege":8,"album_id":"720564","sqprivilege":10,"320privilege":10,"album_audio_id":29860019,"rp_type":"audio","320filesize":8244454,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":290817,"remark":"《恶作剧之吻》电视剧插曲","pkg_price_320":1,"fail_process":4,"sqhash":"3F2E3ABB1F0653E98D9D4F875F373194","duration":206,"sqfilesize":24323033,"pay_type_sq":3,"fail_process_sq":4,"brief":"全世界都知道一厢情愿会苦恼，可他们不知道的是，不对你好会更苦恼。","topic_url_320":"","320hash":"DA3BE4EAE3F1E7B8BAEF2D78E307DDC8"}],"total":30},"pagesize":30,"page":1}
     * info : {"list":{"trans_param":{"special_tag":0},"specialname":"暗恋 | 关于我爱你，都是不能说的秘密","nickname":"光荣","publishtime":"2019-02-18 00:00:00","singername":"","intro":"暗恋，不是简单的说不出口的喜欢，它更是一个人的寂寞孤单。就像在一个大大的空房子里，拼命呐喊，听到的只是自己的回声。\n\n有人说，暗恋是一个人的兵荒马乱，怕对方不知道又怕Ta知晓。坚持着一个人的单恋，还嘴硬地说着\u201c与你无关\u201d。\n\n\u2014\u2014封面图来自电影《不能说的秘密》剧照","commentcount":20,"songcount":30,"imgurl":"http://imge.kugou.com/soft/collection/{size}/20190218/20190218181731312849.jpg","collectcount":220,"suid":1295683729,"tags":[{"tagname":"流行","tagid":9},{"tagname":"国语","tagid":84},{"tagname":"伤感","tagid":578}],"playcount":459712,"specialid":604610,"slid":0}}
     * pagesize : 30
     * __Tpl : plist/list.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private ListBeanX list;
    private InfoBeanX info;
    private int pagesize;
    private String __Tpl;

    public int getJS_CSS_DATE() {
        return JS_CSS_DATE;
    }

    public void setJS_CSS_DATE(int JS_CSS_DATE) {
        this.JS_CSS_DATE = JS_CSS_DATE;
    }

    public String getKg_domain() {
        return kg_domain;
    }

    public void setKg_domain(String kg_domain) {
        this.kg_domain = kg_domain;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Object getFr() {
        return fr;
    }

    public void setFr(Object fr) {
        this.fr = fr;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public ListBeanX getList() {
        return list;
    }

    public void setList(ListBeanX list) {
        this.list = list;
    }

    public InfoBeanX getInfo() {
        return info;
    }

    public void setInfo(InfoBeanX info) {
        this.info = info;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public static class ListBeanX {
        /**
         * list : {"timestamp":1550824517,"info":[{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4747981,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7214975},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"周杰伦 - 不能说的秘密","price_320":200,"extname":"mp3","hash":"6859F85541A3D58FA441D7B4B3E64F38","mvhash":"BC13EEFDC007D14C1FAC9A1045D57191","privilege":8,"album_id":"1737923","sqprivilege":10,"320privilege":10,"album_audio_id":39564288,"rp_type":"audio","320filesize":11864815,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":316495,"remark":"《不能说的秘密》电影插曲","pkg_price_320":1,"fail_process":4,"sqhash":"453A2C813A5919F81AF81AC527E44EDD","duration":296,"sqfilesize":33431251,"pay_type_sq":3,"fail_process_sq":4,"brief":"说出口恐怕连守护都无法继续，只能缄默如初，在回忆里打转，永远保守这个秘密。","topic_url_320":"","320hash":"43A000A7F3EB9AB91CBB59673015ECFA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4725072,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4953191},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张悬 - 关于我爱你","price_320":200,"extname":"mp3","hash":"C2DDE35B0FC3C3BEA72FB85A28EF8C74","mvhash":"354CA5AC3D5682EEE68BE5A54C550654","privilege":8,"album_id":"978383","sqprivilege":10,"320privilege":10,"album_audio_id":32203674,"rp_type":"audio","320filesize":11822151,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":17602,"remark":"《失恋33天》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"DEAEBB68A2AEF69BFFB1EED6AAB654BB","duration":295,"sqfilesize":32700597,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱上你已是最大的侥幸，张悬温暖又清澈的声音道出了爱情晦涩的真理。","topic_url_320":"","320hash":"52A617F29853684F89AAEC3AAD98FAA1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3059460,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":23063908},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王菲 - 爱不可及","price_320":200,"extname":"mp3","hash":"8754D1E884B89B62B042F6AF74B4B12B","mvhash":"37BD3394B3FCFD0AEA5A3BF4FBBA8894","privilege":8,"album_id":"540356","sqprivilege":10,"320privilege":10,"album_audio_id":27740596,"rp_type":"audio","320filesize":7647607,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":4222175,"remark":"《触不可及》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"BB38684600513DF6C78DB6E32F77B9EE","duration":191,"sqfilesize":20542871,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱不可及四个字是历经周折后最无奈的自语，王菲回首往事，空灵之余是缺憾。","topic_url_320":"","320hash":"3BD4E5E0C1B2E72BB27EC71C85ED6E79"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4966993,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7212601},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"范玮琪 - 到不了","price_320":200,"extname":"mp3","hash":"F5DD826A06C5F9CDF6EC9E9B77D78F5E","mvhash":"6458A6783957CA029FB54743C9E21889","privilege":8,"album_id":"960621","sqprivilege":10,"320privilege":10,"album_audio_id":32044731,"rp_type":"audio","320filesize":12453093,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":173456,"remark":"最初的梦想","pkg_price_320":1,"fail_process":4,"sqhash":"8AAB653C7F889B66EF0C74580EF857B6","duration":310,"sqfilesize":32526131,"pay_type_sq":3,"fail_process_sq":4,"brief":"天高可以飞翔，遇水可以架桥，而你的心我始终到不了。范范通透的嗓音有隐忍的心酸。","topic_url_320":"","320hash":"12EA76A959ABB8C89597D80E30A5FB78"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3067948,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31973108},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡健雅 - 与你无关","price_320":200,"extname":"mp3","hash":"CB7CE1753BFE34D33E8F1F96E5806FE3","mvhash":"4B06A626776869C4B6AE3B11AD0AFC53","privilege":8,"album_id":"982412","sqprivilege":10,"320privilege":10,"album_audio_id":32241351,"rp_type":"audio","320filesize":7585200,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":101919,"remark":"呼吸","pkg_price_320":1,"fail_process":4,"sqhash":"E0FA10133E2F856BF63A08E633D8327C","duration":191,"sqfilesize":18069276,"pay_type_sq":3,"fail_process_sq":4,"brief":"这是蔡健雅早期的作品，由林夕填词。倔强的唱着与你无关，一切了然。","topic_url_320":"","320hash":"D899905E61BEBF5F6AD2360E4D914D9A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4403744,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7343652},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨宗纬 - 那个男人","price_320":200,"extname":"mp3","hash":"A6878F84CDF33A22141B3356294CEDC8","mvhash":"92BE6616DEA95356C22A72EB3DBF806C","privilege":8,"album_id":"958957","sqprivilege":10,"320privilege":10,"album_audio_id":32029839,"rp_type":"audio","320filesize":10900081,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12911,"remark":"《그남자》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"634DF26E1442B81498148432B300CD91","duration":275,"sqfilesize":29224848,"pay_type_sq":3,"fail_process_sq":4,"brief":"杨宗纬的哭腔最适合表达爱而不得的苦楚。默默爱着的人需要多久才会被知晓?","topic_url_320":"","320hash":"E69BEAEF04F8219878068DFC0FE4042A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4461290,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952548},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏 - 你不知道的事","price_320":200,"extname":"mp3","hash":"834547CEABC6E788FF4555ED5BB77101","mvhash":"ED4DC0884410795D40071231DA454724","privilege":8,"album_id":"982128","sqprivilege":10,"320privilege":10,"album_audio_id":32238945,"rp_type":"audio","320filesize":11152398,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":336735,"remark":"《恋爱通告》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"77B640D1393FC149F5B8333082F054DD","duration":279,"sqfilesize":29922641,"pay_type_sq":3,"fail_process_sq":4,"brief":"万事奇妙，我也很奇怪怎么会沦陷于你，我们都不知道恋爱这件事走向何处。","topic_url_320":"","320hash":"1D41B0AA7ADDF62527D7375E11055426"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4014201,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31823486},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张靓颖 - 个人秘密","price_320":200,"extname":"mp3","hash":"E42A47692AB268DC9DD025E883709D3A","mvhash":"C1AABA4129D276DF719AEE514E71686B","privilege":8,"album_id":"1077480","sqprivilege":10,"320privilege":10,"album_audio_id":33145285,"rp_type":"audio","320filesize":10036435,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12998,"remark":"张靓颖 2007北京演唱会","pkg_price_320":1,"fail_process":4,"sqhash":"286CBD45D938A9D58818988222C6B4D6","duration":250,"sqfilesize":29631195,"pay_type_sq":3,"fail_process_sq":4,"brief":"张靓颖唱出放手的那个人的心声，晚爱一步，有多懂事就有多寂寥。","topic_url_320":"","320hash":"22DB23E3871CAC17B9DB3E82528B7155"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":5284803,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":46257697},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"许茹芸 - 如果云知道","price_320":200,"extname":"mp3","hash":"0D7A3DCE91F2CDCA1F6FEDC38491FA02","mvhash":"7A4480B0F68203A3A4DB5AB46DDD288E","privilege":8,"album_id":"885853","sqprivilege":10,"320privilege":10,"album_audio_id":31302797,"rp_type":"audio","320filesize":13122344,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":348615,"remark":"青梅竹马101","pkg_price_320":1,"fail_process":4,"sqhash":"C742677FA968A04F65542680B6B79C41","duration":330,"sqfilesize":35949226,"pay_type_sq":3,"fail_process_sq":4,"brief":"许茹芸的歌声也如云，飘飘悠悠。云听得到，但更希望你会听到。","topic_url_320":"","320hash":"140C76F22D752BDCCA6DA88C298E3C5D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4010560,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7204837},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"G.E.M.邓紫棋 - 我的秘密","price_320":200,"extname":"mp3","hash":"EBE4738C734C89C2CCF48DC4D1737407","mvhash":"E69575BDAB79FA74B16378BA38B94B0C","privilege":8,"album_id":"976561","sqprivilege":10,"320privilege":10,"album_audio_id":32186878,"rp_type":"audio","320filesize":10007244,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":50102,"remark":"My Secret","pkg_price_320":1,"fail_process":4,"sqhash":"894648BBECF179C5DEA6C54954738296","duration":250,"sqfilesize":30250382,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋也不都是苦涩的，邓紫棋的这首歌里有萌生爱意时的喜悦，也期待秘密被发现。","topic_url_320":"","320hash":"3C1E1D3468AAB34E6EEE25FD24A779DA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3400559,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32678654},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"房东的猫 - 你是我最愚蠢的一次浪漫","price_320":200,"extname":"mp3","hash":"D4E0CF30B40813B3625BC5CB2F0ACA34","mvhash":"","privilege":8,"album_id":"8445681","sqprivilege":10,"320privilege":10,"album_audio_id":108461617,"rp_type":"audio","320filesize":8796201,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":27964539,"remark":"柔软","pkg_price_320":1,"fail_process":4,"sqhash":"CEB4414640A178193365FF8B70B3B5A0","duration":212,"sqfilesize":21042129,"pay_type_sq":3,"fail_process_sq":4,"brief":"不争不抢似乎总是受伤，懊悔自己的愚蠢却还是觉得不枉一次浪漫。","topic_url_320":"","320hash":"872B2905B26FE48D410C071B697DED93"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3925889,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":37261491},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"张杰 - 他不懂 (Live)","price_320":0,"extname":"mp3","hash":"44AE03FF48CB725D9E7F3CE23EEE40F5","mvhash":"","privilege":8,"album_id":"1004310","sqprivilege":0,"320privilege":0,"album_audio_id":32444791,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2557021,"remark":"我是歌手第二季 双年巅峰会","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":245,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"被爱的人都有恃无恐，他不懂，也不愿意去懂对方没说出口的是什么。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4143962,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":30274296},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"姚贝娜 - 矜持","price_320":200,"extname":"mp3","hash":"92B893ED081B01E01C256CFE6CAA9D57","mvhash":"2EF623EE812182923E2BB584DD9DAEA2","privilege":8,"album_id":"558965","sqprivilege":10,"320privilege":10,"album_audio_id":28154934,"rp_type":"audio","320filesize":10363468,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2505359,"remark":"《前任攻略》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"C315C274F5498C0B45660612A7DA2F18","duration":258,"sqfilesize":31625259,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道不会被你爱上，我也不后悔付过出我真心，即使是抛弃矜贵的代价。","topic_url_320":"","320hash":"3321B680EB4608E40EC7F83B2262F667"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":2668378,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997036},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏、任家萱 - 你是我心内的一首歌","price_320":200,"extname":"mp3","hash":"706C25F9CCF316FF68371E16DC788DCE","mvhash":"B6629A4988E9A88616D73BC6222F7FCA","privilege":8,"album_id":"526409","sqprivilege":10,"320privilege":10,"album_audio_id":27581574,"rp_type":"audio","320filesize":6671863,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":717298,"remark":"大马Music Man纪念精选辑","pkg_price_320":1,"fail_process":4,"sqhash":"CA4C81FA86AD16920831CCD715D2BE8D","duration":166,"sqfilesize":19595839,"pay_type_sq":3,"fail_process_sq":4,"brief":"或许暗恋有甜蜜，互相暗恋的两个人，都不愿说出口，但在心里早已响起爱歌。","topic_url_320":"","320hash":"23EAECA9A0A05A99BF9A5996638586F0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3532810,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464587},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"金莎 - 我知道我们不会有结果","price_320":200,"extname":"mp3","hash":"1ABFE2DAC7446228A98A000FFC08CBA0","mvhash":"5C7A2E5B690B0A20E9BB8F6C9BB7EB25","privilege":8,"album_id":"963944","sqprivilege":10,"320privilege":10,"album_audio_id":32075082,"rp_type":"audio","320filesize":8933029,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":47892,"remark":"《안 행복해》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"B6444AF20AC3C6BA92F72F8DF135AAE5","duration":220,"sqfilesize":26144808,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道你是深渊，你是毒药，可还是义无反顾，毫无保留，也许唯一结果便是放手祝福。","topic_url_320":"","320hash":"2064739B08CB73C6E1F0B259EAFC4321"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3195714,"bitrate":129,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":18600730},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"林俊杰 - 期待你的爱","price_320":0,"extname":"mp3","hash":"8892E00C1666F5AD0725F8EF0B83534F","mvhash":"","privilege":8,"album_id":"1507385","sqprivilege":0,"320privilege":0,"album_audio_id":61767842,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":147232,"remark":"《原来我不帅》电视剧片尾曲","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":199,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"每个人都有爱的权利，都有期待被爱的渴求，林俊杰告诉你沉默不如放手去爱。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3737381,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997111},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡淳佳 - 依恋","price_320":200,"extname":"mp3","hash":"BD240D1EC4A601BC783F12BE31B9658A","mvhash":"0AC678887159BA043EF95043131D6673","privilege":8,"album_id":"559315","sqprivilege":10,"320privilege":10,"album_audio_id":28159136,"rp_type":"audio","320filesize":9341573,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":174326,"remark":"《Je m'appelle Hélène》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"BE5E7EA9806AC0E8B403A972912A8C75","duration":233,"sqfilesize":26461934,"pay_type_sq":3,"fail_process_sq":4,"brief":"你像秋千，我只好做原点，来捕捉你的片刻停留，只为多一分对你的依恋。","topic_url_320":"","320hash":"3989263C2B3E481871A8462ADD678AB7"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4227082,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"林宥嘉 - 说谎 (Live)","price_320":0,"extname":"mp3","hash":"95FEB4D752874A9277761F0FDF92858D","mvhash":"","privilege":0,"album_id":"1737824","sqprivilege":0,"320privilege":0,"album_audio_id":39562257,"rp_type":"audio","320filesize":10538007,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":328354,"remark":"坚强的背后","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":263,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"《 说谎》是林宥嘉刚出道不久的作品，那时的林宥嘉唱腔满含真情，一个最不会说谎的声音为爱隐瞒太多心事。","topic_url_320":"","320hash":"51B14739092E8A78E83C27089C91A31A"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4955833,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"蓝又时 - 秘密","price_320":0,"extname":"mp3","hash":"9602AB6E441DF1E96FE4552B6ABA8546","mvhash":"F546A073EE6C0313B0527A0D9B2EC169","privilege":0,"album_id":"2300492","sqprivilege":0,"320privilege":0,"album_audio_id":88065989,"rp_type":"audio","320filesize":12312202,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":185129,"remark":"穿越音乐时光 写情歌的女人","pkg_price_320":0,"fail_process":0,"sqhash":"5EFA987F32EF59EC18D7A23A3E5CF216","duration":307,"sqfilesize":31937913,"pay_type_sq":0,"fail_process_sq":0,"brief":"爱一个人最开始和最终的状态，都是缘起于秘密，开始是不愿提起，结束时是不能提起。","topic_url_320":"","320hash":"C9E6C88A24FA115D40EAAFFDEF7D5CA0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4244418,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32485916},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"孙伯纶 - 口是心非","price_320":200,"extname":"mp3","hash":"ABE9D0EFD958F3B61DD3776D0AFE4F86","mvhash":"","privilege":8,"album_id":"1597443","sqprivilege":10,"320privilege":10,"album_audio_id":38258938,"rp_type":"audio","320filesize":10595781,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":95230,"remark":"痛在爱的边缘Ⅱ:残酷的温柔","pkg_price_320":1,"fail_process":4,"sqhash":"788E0D3CFE530DEFF41F5DFA4F0B7DBB","duration":264,"sqfilesize":32886158,"pay_type_sq":3,"fail_process_sq":4,"brief":"孙伯纶很适合诠释不善言辞的男子形象，明明爱意在心，口却难开，变得物是人非。","topic_url_320":"","320hash":"713A41B96AEFD2DFBC0A8F710C592C36"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4515157,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5114901},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"萧亚轩 - 类似爱情","price_320":200,"extname":"mp3","hash":"D4E095ED4617FBE238F22DE8907845EE","mvhash":"DA20FC9D4688900234F00A06AD704029","privilege":8,"album_id":"521727","sqprivilege":10,"320privilege":10,"album_audio_id":27531651,"rp_type":"audio","320filesize":11278791,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":245858,"remark":"Super Girl 爱无畏","pkg_price_320":1,"fail_process":4,"sqhash":"36849CF0C6D6BE6ADBC9B7ED28BE9F0D","duration":282,"sqfilesize":29963046,"pay_type_sq":3,"fail_process_sq":4,"brief":"这首歌适合表达所有不便说出口的禁忌之恋，类似于爱情的回应就已经足够了。","topic_url_320":"","320hash":"DB26342C3C6BC93D239966C27497B571"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4300598,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":34191781},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"张智成 - 暗恋","price_320":0,"extname":"mp3","hash":"9603D35C3419292CEC14486E761F09DA","mvhash":"FBD94A8CC2270CAB5F0B966388CD2CBC","privilege":0,"album_id":"970960","sqprivilege":0,"320privilege":0,"album_audio_id":32137250,"rp_type":"audio","320filesize":10756360,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":160094,"remark":"暗恋","pkg_price_320":0,"fail_process":0,"sqhash":"ABAC7A034B205048298250214BD42DF6","duration":268,"sqfilesize":31453265,"pay_type_sq":0,"fail_process_sq":0,"brief":"跨过那道边界，不确定是靠近还是遥远，所以只能躲进好朋友的身份里继续爱着。","topic_url_320":"","320hash":"ED91122C6D1CE27167F280B4B4E579C8"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4690164,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32198664},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"板蓝根_Ryan - 你怎么蠢到我喜欢你都不知道","price_320":0,"extname":"mp3","hash":"1FFBEABC5215E5150AD62AB5F4CDBB4B","mvhash":"","privilege":0,"album_id":"8348783","sqprivilege":0,"320privilege":0,"album_audio_id":106262601,"rp_type":"audio","320filesize":11725044,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":36945347,"remark":"你怎么蠢到我喜欢你都不知道","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":293,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"你怎么蠢到我喜欢你都不知道？即使全世界都知道，也败给一个人的装聋作哑，视而不见，如此也便有了幽怨。","topic_url_320":"","320hash":"080494182401C6E8CD3AE4D0AD472B91"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4208376,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952603},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨丞琳 - 匿名的好友","price_320":200,"extname":"mp3","hash":"1C2297E5C24E05F7361A68DAA603E2AD","mvhash":"FBDF9B5871AA8E76B1FE44830EA01729","privilege":8,"album_id":"977004","sqprivilege":10,"320privilege":10,"album_audio_id":64500226,"rp_type":"audio","320filesize":10517129,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":251083,"remark":"《灿烂的遗产》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"8F12CDC77D301F84DB27F60C9C9BDF79","duration":262,"sqfilesize":28439384,"pay_type_sq":3,"fail_process_sq":4,"brief":"听完《匿名的好友》，似乎懂得：所有如果都没有结果，但悸动还在，只能隐姓埋名，做你最隐秘的好友 。","topic_url_320":"","320hash":"C1E36BBE2D46D9403BD593978B7436E9"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4118538,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464091},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"棉花糖 - 请帮我爱他","price_320":200,"extname":"mp3","hash":"70E519B3EE2BC6E985645679C4274584","mvhash":"AAAEAF9EF17827607B6899F265CEE73C","privilege":8,"album_id":"561198","sqprivilege":10,"320privilege":10,"album_audio_id":28185836,"rp_type":"audio","320filesize":10192061,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":64915,"remark":"小飞行","pkg_price_320":1,"fail_process":4,"sqhash":"13B624147B240BD4235CF04367A5D010","duration":254,"sqfilesize":29499514,"pay_type_sq":3,"fail_process_sq":4,"brief":"有一种爱叫做放手，一个人的相思好过三个人的纠缠难过。","topic_url_320":"","320hash":"BDB6CE1D302B139ABD19360A46A14EE1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3558547,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32480371},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"刘若英 - 知道不知道?","price_320":200,"extname":"mp3","hash":"DA6A7E19051E9D691762886851114841","mvhash":"2FA7D579BF04D2A838E94D7E2D763414","privilege":8,"album_id":"971958","sqprivilege":10,"320privilege":10,"album_audio_id":32145932,"rp_type":"audio","320filesize":8844233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":345132,"remark":"《天下无贼》片尾曲","pkg_price_320":1,"fail_process":4,"sqhash":"79A190DCD81C80F845AB3B8B1473739B","duration":222,"sqfilesize":21175421,"pay_type_sq":3,"fail_process_sq":4,"brief":"奶茶的歌里就算有伤感，也是泛着热气的。关于暗恋，知道还是不知道，我心明了。","topic_url_320":"","320hash":"11B1636B3ECDD587AD24595FBF225D7D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4771003,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5113276},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"陶喆 - 暗恋","price_320":200,"extname":"mp3","hash":"1B2C7CB1A3BB84BF41582A341C70B4D9","mvhash":"1527E2F763FC9398101A593E2BFF69DB","privilege":8,"album_id":"979261","sqprivilege":10,"320privilege":10,"album_audio_id":32212276,"rp_type":"audio","320filesize":11971565,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":5225,"remark":"69乐章","pkg_price_320":1,"fail_process":4,"sqhash":"CD23908D75F41D4C84654F75A7DB955D","duration":298,"sqfilesize":31068360,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋是创作才子们永恒的话题，在陶喆的歌里苦涩的暗恋又多了一分浪漫和洒脱。","topic_url_320":"","320hash":"B947C5978CEDF346F0FE9494BC25DCEA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":0,"filesize":5166504,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4950121},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"卢学睿 - 可不可以爱我","price_320":200,"extname":"mp3","hash":"0CB87F37FD828ECE22E72873C5EF01BA","mvhash":"7F791C3FE5F2E500424C5F656C779700","privilege":8,"album_id":"555831","sqprivilege":0,"320privilege":10,"album_audio_id":28117779,"rp_type":"audio","320filesize":12796018,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":716155,"remark":"hitto!!超人气偶像剧主题曲精选","pkg_price_320":1,"fail_process":4,"sqhash":"","duration":319,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"卢学睿的歌里有孩子般的执拗，每一个暗恋中的人都会困惑，究竟要怎么做才会得到爱的回音。","topic_url_320":"","320hash":"A293B5EC455E3B030FA55C1D88E2207D"},{"pay_type_320":1,"m4afilesize":0,"price_sq":200,"filesize":4149124,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32008978},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":1,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"丛铭君 - 听说","price_320":200,"extname":"mp3","hash":"D4758F2973BE3CC7E89C62F432BE9583","mvhash":"9E4C74CC22748A73CEC7044555F22825","privilege":8,"album_id":"4040155","sqprivilege":10,"320privilege":10,"album_audio_id":88246147,"rp_type":"audio","320filesize":10372746,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":28474961,"remark":"听说","pkg_price_320":1,"fail_process":4,"sqhash":"6A7656B0B3DB8806EB0DA0F75BE36B5D","duration":259,"sqfilesize":27299769,"pay_type_sq":1,"fail_process_sq":4,"brief":"丛铭君的《听说》表达了一种恍若隔世的暗恋：时隔多年，当初偷偷爱着的那个人，也渐渐成了别人口中的听说。","topic_url_320":"","320hash":"934D4C5B35AC56A7A3228F6A2279C89F"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3299229,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":13944677},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王俞匀 - 全世界的人都知道","price_320":200,"extname":"mp3","hash":"F1AB637FC78F89D431207631357CA12F","mvhash":"4D5D5B04AB292F26868ABA47FCA99529","privilege":8,"album_id":"720564","sqprivilege":10,"320privilege":10,"album_audio_id":29860019,"rp_type":"audio","320filesize":8244454,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":290817,"remark":"《恶作剧之吻》电视剧插曲","pkg_price_320":1,"fail_process":4,"sqhash":"3F2E3ABB1F0653E98D9D4F875F373194","duration":206,"sqfilesize":24323033,"pay_type_sq":3,"fail_process_sq":4,"brief":"全世界都知道一厢情愿会苦恼，可他们不知道的是，不对你好会更苦恼。","topic_url_320":"","320hash":"DA3BE4EAE3F1E7B8BAEF2D78E307DDC8"}],"total":30}
         * pagesize : 30
         * page : 1
         */

        private ListBean list;
        private int pagesize;
        private int page;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public static class ListBean {
            /**
             * timestamp : 1550824517
             * info : [{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4747981,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7214975},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"周杰伦 - 不能说的秘密","price_320":200,"extname":"mp3","hash":"6859F85541A3D58FA441D7B4B3E64F38","mvhash":"BC13EEFDC007D14C1FAC9A1045D57191","privilege":8,"album_id":"1737923","sqprivilege":10,"320privilege":10,"album_audio_id":39564288,"rp_type":"audio","320filesize":11864815,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":316495,"remark":"《不能说的秘密》电影插曲","pkg_price_320":1,"fail_process":4,"sqhash":"453A2C813A5919F81AF81AC527E44EDD","duration":296,"sqfilesize":33431251,"pay_type_sq":3,"fail_process_sq":4,"brief":"说出口恐怕连守护都无法继续，只能缄默如初，在回忆里打转，永远保守这个秘密。","topic_url_320":"","320hash":"43A000A7F3EB9AB91CBB59673015ECFA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4725072,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4953191},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张悬 - 关于我爱你","price_320":200,"extname":"mp3","hash":"C2DDE35B0FC3C3BEA72FB85A28EF8C74","mvhash":"354CA5AC3D5682EEE68BE5A54C550654","privilege":8,"album_id":"978383","sqprivilege":10,"320privilege":10,"album_audio_id":32203674,"rp_type":"audio","320filesize":11822151,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":17602,"remark":"《失恋33天》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"DEAEBB68A2AEF69BFFB1EED6AAB654BB","duration":295,"sqfilesize":32700597,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱上你已是最大的侥幸，张悬温暖又清澈的声音道出了爱情晦涩的真理。","topic_url_320":"","320hash":"52A617F29853684F89AAEC3AAD98FAA1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3059460,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":23063908},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王菲 - 爱不可及","price_320":200,"extname":"mp3","hash":"8754D1E884B89B62B042F6AF74B4B12B","mvhash":"37BD3394B3FCFD0AEA5A3BF4FBBA8894","privilege":8,"album_id":"540356","sqprivilege":10,"320privilege":10,"album_audio_id":27740596,"rp_type":"audio","320filesize":7647607,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":4222175,"remark":"《触不可及》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"BB38684600513DF6C78DB6E32F77B9EE","duration":191,"sqfilesize":20542871,"pay_type_sq":3,"fail_process_sq":4,"brief":"爱不可及四个字是历经周折后最无奈的自语，王菲回首往事，空灵之余是缺憾。","topic_url_320":"","320hash":"3BD4E5E0C1B2E72BB27EC71C85ED6E79"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4966993,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7212601},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"范玮琪 - 到不了","price_320":200,"extname":"mp3","hash":"F5DD826A06C5F9CDF6EC9E9B77D78F5E","mvhash":"6458A6783957CA029FB54743C9E21889","privilege":8,"album_id":"960621","sqprivilege":10,"320privilege":10,"album_audio_id":32044731,"rp_type":"audio","320filesize":12453093,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":173456,"remark":"最初的梦想","pkg_price_320":1,"fail_process":4,"sqhash":"8AAB653C7F889B66EF0C74580EF857B6","duration":310,"sqfilesize":32526131,"pay_type_sq":3,"fail_process_sq":4,"brief":"天高可以飞翔，遇水可以架桥，而你的心我始终到不了。范范通透的嗓音有隐忍的心酸。","topic_url_320":"","320hash":"12EA76A959ABB8C89597D80E30A5FB78"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3067948,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31973108},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡健雅 - 与你无关","price_320":200,"extname":"mp3","hash":"CB7CE1753BFE34D33E8F1F96E5806FE3","mvhash":"4B06A626776869C4B6AE3B11AD0AFC53","privilege":8,"album_id":"982412","sqprivilege":10,"320privilege":10,"album_audio_id":32241351,"rp_type":"audio","320filesize":7585200,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":101919,"remark":"呼吸","pkg_price_320":1,"fail_process":4,"sqhash":"E0FA10133E2F856BF63A08E633D8327C","duration":191,"sqfilesize":18069276,"pay_type_sq":3,"fail_process_sq":4,"brief":"这是蔡健雅早期的作品，由林夕填词。倔强的唱着与你无关，一切了然。","topic_url_320":"","320hash":"D899905E61BEBF5F6AD2360E4D914D9A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4403744,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7343652},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨宗纬 - 那个男人","price_320":200,"extname":"mp3","hash":"A6878F84CDF33A22141B3356294CEDC8","mvhash":"92BE6616DEA95356C22A72EB3DBF806C","privilege":8,"album_id":"958957","sqprivilege":10,"320privilege":10,"album_audio_id":32029839,"rp_type":"audio","320filesize":10900081,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12911,"remark":"《그남자》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"634DF26E1442B81498148432B300CD91","duration":275,"sqfilesize":29224848,"pay_type_sq":3,"fail_process_sq":4,"brief":"杨宗纬的哭腔最适合表达爱而不得的苦楚。默默爱着的人需要多久才会被知晓?","topic_url_320":"","320hash":"E69BEAEF04F8219878068DFC0FE4042A"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4461290,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952548},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏 - 你不知道的事","price_320":200,"extname":"mp3","hash":"834547CEABC6E788FF4555ED5BB77101","mvhash":"ED4DC0884410795D40071231DA454724","privilege":8,"album_id":"982128","sqprivilege":10,"320privilege":10,"album_audio_id":32238945,"rp_type":"audio","320filesize":11152398,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":336735,"remark":"《恋爱通告》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"77B640D1393FC149F5B8333082F054DD","duration":279,"sqfilesize":29922641,"pay_type_sq":3,"fail_process_sq":4,"brief":"万事奇妙，我也很奇怪怎么会沦陷于你，我们都不知道恋爱这件事走向何处。","topic_url_320":"","320hash":"1D41B0AA7ADDF62527D7375E11055426"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4014201,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":31823486},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张靓颖 - 个人秘密","price_320":200,"extname":"mp3","hash":"E42A47692AB268DC9DD025E883709D3A","mvhash":"C1AABA4129D276DF719AEE514E71686B","privilege":8,"album_id":"1077480","sqprivilege":10,"320privilege":10,"album_audio_id":33145285,"rp_type":"audio","320filesize":10036435,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":12998,"remark":"张靓颖 2007北京演唱会","pkg_price_320":1,"fail_process":4,"sqhash":"286CBD45D938A9D58818988222C6B4D6","duration":250,"sqfilesize":29631195,"pay_type_sq":3,"fail_process_sq":4,"brief":"张靓颖唱出放手的那个人的心声，晚爱一步，有多懂事就有多寂寥。","topic_url_320":"","320hash":"22DB23E3871CAC17B9DB3E82528B7155"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":5284803,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":46257697},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"许茹芸 - 如果云知道","price_320":200,"extname":"mp3","hash":"0D7A3DCE91F2CDCA1F6FEDC38491FA02","mvhash":"7A4480B0F68203A3A4DB5AB46DDD288E","privilege":8,"album_id":"885853","sqprivilege":10,"320privilege":10,"album_audio_id":31302797,"rp_type":"audio","320filesize":13122344,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":348615,"remark":"青梅竹马101","pkg_price_320":1,"fail_process":4,"sqhash":"C742677FA968A04F65542680B6B79C41","duration":330,"sqfilesize":35949226,"pay_type_sq":3,"fail_process_sq":4,"brief":"许茹芸的歌声也如云，飘飘悠悠。云听得到，但更希望你会听到。","topic_url_320":"","320hash":"140C76F22D752BDCCA6DA88C298E3C5D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4010560,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7204837},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"G.E.M.邓紫棋 - 我的秘密","price_320":200,"extname":"mp3","hash":"EBE4738C734C89C2CCF48DC4D1737407","mvhash":"E69575BDAB79FA74B16378BA38B94B0C","privilege":8,"album_id":"976561","sqprivilege":10,"320privilege":10,"album_audio_id":32186878,"rp_type":"audio","320filesize":10007244,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":50102,"remark":"My Secret","pkg_price_320":1,"fail_process":4,"sqhash":"894648BBECF179C5DEA6C54954738296","duration":250,"sqfilesize":30250382,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋也不都是苦涩的，邓紫棋的这首歌里有萌生爱意时的喜悦，也期待秘密被发现。","topic_url_320":"","320hash":"3C1E1D3468AAB34E6EEE25FD24A779DA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3400559,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32678654},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"房东的猫 - 你是我最愚蠢的一次浪漫","price_320":200,"extname":"mp3","hash":"D4E0CF30B40813B3625BC5CB2F0ACA34","mvhash":"","privilege":8,"album_id":"8445681","sqprivilege":10,"320privilege":10,"album_audio_id":108461617,"rp_type":"audio","320filesize":8796201,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":27964539,"remark":"柔软","pkg_price_320":1,"fail_process":4,"sqhash":"CEB4414640A178193365FF8B70B3B5A0","duration":212,"sqfilesize":21042129,"pay_type_sq":3,"fail_process_sq":4,"brief":"不争不抢似乎总是受伤，懊悔自己的愚蠢却还是觉得不枉一次浪漫。","topic_url_320":"","320hash":"872B2905B26FE48D410C071B697DED93"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3925889,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":37261491},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"张杰 - 他不懂 (Live)","price_320":0,"extname":"mp3","hash":"44AE03FF48CB725D9E7F3CE23EEE40F5","mvhash":"","privilege":8,"album_id":"1004310","sqprivilege":0,"320privilege":0,"album_audio_id":32444791,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2557021,"remark":"我是歌手第二季 双年巅峰会","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":245,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"被爱的人都有恃无恐，他不懂，也不愿意去懂对方没说出口的是什么。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4143962,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":30274296},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"姚贝娜 - 矜持","price_320":200,"extname":"mp3","hash":"92B893ED081B01E01C256CFE6CAA9D57","mvhash":"2EF623EE812182923E2BB584DD9DAEA2","privilege":8,"album_id":"558965","sqprivilege":10,"320privilege":10,"album_audio_id":28154934,"rp_type":"audio","320filesize":10363468,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":2505359,"remark":"《前任攻略》电影主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"C315C274F5498C0B45660612A7DA2F18","duration":258,"sqfilesize":31625259,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道不会被你爱上，我也不后悔付过出我真心，即使是抛弃矜贵的代价。","topic_url_320":"","320hash":"3321B680EB4608E40EC7F83B2262F667"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":2668378,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997036},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王力宏、任家萱 - 你是我心内的一首歌","price_320":200,"extname":"mp3","hash":"706C25F9CCF316FF68371E16DC788DCE","mvhash":"B6629A4988E9A88616D73BC6222F7FCA","privilege":8,"album_id":"526409","sqprivilege":10,"320privilege":10,"album_audio_id":27581574,"rp_type":"audio","320filesize":6671863,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":717298,"remark":"大马Music Man纪念精选辑","pkg_price_320":1,"fail_process":4,"sqhash":"CA4C81FA86AD16920831CCD715D2BE8D","duration":166,"sqfilesize":19595839,"pay_type_sq":3,"fail_process_sq":4,"brief":"或许暗恋有甜蜜，互相暗恋的两个人，都不愿说出口，但在心里早已响起爱歌。","topic_url_320":"","320hash":"23EAECA9A0A05A99BF9A5996638586F0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3532810,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464587},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"金莎 - 我知道我们不会有结果","price_320":200,"extname":"mp3","hash":"1ABFE2DAC7446228A98A000FFC08CBA0","mvhash":"5C7A2E5B690B0A20E9BB8F6C9BB7EB25","privilege":8,"album_id":"963944","sqprivilege":10,"320privilege":10,"album_audio_id":32075082,"rp_type":"audio","320filesize":8933029,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":47892,"remark":"《안 행복해》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"B6444AF20AC3C6BA92F72F8DF135AAE5","duration":220,"sqfilesize":26144808,"pay_type_sq":3,"fail_process_sq":4,"brief":"知道你是深渊，你是毒药，可还是义无反顾，毫无保留，也许唯一结果便是放手祝福。","topic_url_320":"","320hash":"2064739B08CB73C6E1F0B259EAFC4321"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":3195714,"bitrate":129,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":18600730},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"林俊杰 - 期待你的爱","price_320":0,"extname":"mp3","hash":"8892E00C1666F5AD0725F8EF0B83534F","mvhash":"","privilege":8,"album_id":"1507385","sqprivilege":0,"320privilege":0,"album_audio_id":61767842,"rp_type":"audio","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":147232,"remark":"《原来我不帅》电视剧片尾曲","pkg_price_320":0,"fail_process":4,"sqhash":"","duration":199,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"每个人都有爱的权利，都有期待被爱的渴求，林俊杰告诉你沉默不如放手去爱。","topic_url_320":"","320hash":""},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3737381,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4997111},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"蔡淳佳 - 依恋","price_320":200,"extname":"mp3","hash":"BD240D1EC4A601BC783F12BE31B9658A","mvhash":"0AC678887159BA043EF95043131D6673","privilege":8,"album_id":"559315","sqprivilege":10,"320privilege":10,"album_audio_id":28159136,"rp_type":"audio","320filesize":9341573,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":174326,"remark":"《Je m'appelle Hélène》国语版","pkg_price_320":1,"fail_process":4,"sqhash":"BE5E7EA9806AC0E8B403A972912A8C75","duration":233,"sqfilesize":26461934,"pay_type_sq":3,"fail_process_sq":4,"brief":"你像秋千，我只好做原点，来捕捉你的片刻停留，只为多一分对你的依恋。","topic_url_320":"","320hash":"3989263C2B3E481871A8462ADD678AB7"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4227082,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"林宥嘉 - 说谎 (Live)","price_320":0,"extname":"mp3","hash":"95FEB4D752874A9277761F0FDF92858D","mvhash":"","privilege":0,"album_id":"1737824","sqprivilege":0,"320privilege":0,"album_audio_id":39562257,"rp_type":"audio","320filesize":10538007,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":328354,"remark":"坚强的背后","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":263,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"《 说谎》是林宥嘉刚出道不久的作品，那时的林宥嘉唱腔满含真情，一个最不会说谎的声音为爱隐瞒太多心事。","topic_url_320":"","320hash":"51B14739092E8A78E83C27089C91A31A"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4955833,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":-1},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"蓝又时 - 秘密","price_320":0,"extname":"mp3","hash":"9602AB6E441DF1E96FE4552B6ABA8546","mvhash":"F546A073EE6C0313B0527A0D9B2EC169","privilege":0,"album_id":"2300492","sqprivilege":0,"320privilege":0,"album_audio_id":88065989,"rp_type":"audio","320filesize":12312202,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":185129,"remark":"穿越音乐时光 写情歌的女人","pkg_price_320":0,"fail_process":0,"sqhash":"5EFA987F32EF59EC18D7A23A3E5CF216","duration":307,"sqfilesize":31937913,"pay_type_sq":0,"fail_process_sq":0,"brief":"爱一个人最开始和最终的状态，都是缘起于秘密，开始是不愿提起，结束时是不能提起。","topic_url_320":"","320hash":"C9E6C88A24FA115D40EAAFFDEF7D5CA0"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4244418,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32485916},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"孙伯纶 - 口是心非","price_320":200,"extname":"mp3","hash":"ABE9D0EFD958F3B61DD3776D0AFE4F86","mvhash":"","privilege":8,"album_id":"1597443","sqprivilege":10,"320privilege":10,"album_audio_id":38258938,"rp_type":"audio","320filesize":10595781,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":95230,"remark":"痛在爱的边缘Ⅱ:残酷的温柔","pkg_price_320":1,"fail_process":4,"sqhash":"788E0D3CFE530DEFF41F5DFA4F0B7DBB","duration":264,"sqfilesize":32886158,"pay_type_sq":3,"fail_process_sq":4,"brief":"孙伯纶很适合诠释不善言辞的男子形象，明明爱意在心，口却难开，变得物是人非。","topic_url_320":"","320hash":"713A41B96AEFD2DFBC0A8F710C592C36"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4515157,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5114901},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"萧亚轩 - 类似爱情","price_320":200,"extname":"mp3","hash":"D4E095ED4617FBE238F22DE8907845EE","mvhash":"DA20FC9D4688900234F00A06AD704029","privilege":8,"album_id":"521727","sqprivilege":10,"320privilege":10,"album_audio_id":27531651,"rp_type":"audio","320filesize":11278791,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":245858,"remark":"Super Girl 爱无畏","pkg_price_320":1,"fail_process":4,"sqhash":"36849CF0C6D6BE6ADBC9B7ED28BE9F0D","duration":282,"sqfilesize":29963046,"pay_type_sq":3,"fail_process_sq":4,"brief":"这首歌适合表达所有不便说出口的禁忌之恋，类似于爱情的回应就已经足够了。","topic_url_320":"","320hash":"DB26342C3C6BC93D239966C27497B571"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4300598,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":34191781},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"张智成 - 暗恋","price_320":0,"extname":"mp3","hash":"9603D35C3419292CEC14486E761F09DA","mvhash":"FBD94A8CC2270CAB5F0B966388CD2CBC","privilege":0,"album_id":"970960","sqprivilege":0,"320privilege":0,"album_audio_id":32137250,"rp_type":"audio","320filesize":10756360,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":160094,"remark":"暗恋","pkg_price_320":0,"fail_process":0,"sqhash":"ABAC7A034B205048298250214BD42DF6","duration":268,"sqfilesize":31453265,"pay_type_sq":0,"fail_process_sq":0,"brief":"跨过那道边界，不确定是靠近还是遥远，所以只能躲进好朋友的身份里继续爱着。","topic_url_320":"","320hash":"ED91122C6D1CE27167F280B4B4E579C8"},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"filesize":4690164,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32198664},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"板蓝根_Ryan - 你怎么蠢到我喜欢你都不知道","price_320":0,"extname":"mp3","hash":"1FFBEABC5215E5150AD62AB5F4CDBB4B","mvhash":"","privilege":0,"album_id":"8348783","sqprivilege":0,"320privilege":0,"album_audio_id":106262601,"rp_type":"audio","320filesize":11725044,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":36945347,"remark":"你怎么蠢到我喜欢你都不知道","pkg_price_320":0,"fail_process":0,"sqhash":"","duration":293,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"你怎么蠢到我喜欢你都不知道？即使全世界都知道，也败给一个人的装聋作哑，视而不见，如此也便有了幽怨。","topic_url_320":"","320hash":"080494182401C6E8CD3AE4D0AD472B91"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4208376,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4952603},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杨丞琳 - 匿名的好友","price_320":200,"extname":"mp3","hash":"1C2297E5C24E05F7361A68DAA603E2AD","mvhash":"FBDF9B5871AA8E76B1FE44830EA01729","privilege":8,"album_id":"977004","sqprivilege":10,"320privilege":10,"album_audio_id":64500226,"rp_type":"audio","320filesize":10517129,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":251083,"remark":"《灿烂的遗产》电视剧主题曲","pkg_price_320":1,"fail_process":4,"sqhash":"8F12CDC77D301F84DB27F60C9C9BDF79","duration":262,"sqfilesize":28439384,"pay_type_sq":3,"fail_process_sq":4,"brief":"听完《匿名的好友》，似乎懂得：所有如果都没有结果，但悸动还在，只能隐姓埋名，做你最隐秘的好友 。","topic_url_320":"","320hash":"C1E36BBE2D46D9403BD593978B7436E9"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4118538,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":22464091},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"棉花糖 - 请帮我爱他","price_320":200,"extname":"mp3","hash":"70E519B3EE2BC6E985645679C4274584","mvhash":"AAAEAF9EF17827607B6899F265CEE73C","privilege":8,"album_id":"561198","sqprivilege":10,"320privilege":10,"album_audio_id":28185836,"rp_type":"audio","320filesize":10192061,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":64915,"remark":"小飞行","pkg_price_320":1,"fail_process":4,"sqhash":"13B624147B240BD4235CF04367A5D010","duration":254,"sqfilesize":29499514,"pay_type_sq":3,"fail_process_sq":4,"brief":"有一种爱叫做放手，一个人的相思好过三个人的纠缠难过。","topic_url_320":"","320hash":"BDB6CE1D302B139ABD19360A46A14EE1"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3558547,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":32480371},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"刘若英 - 知道不知道?","price_320":200,"extname":"mp3","hash":"DA6A7E19051E9D691762886851114841","mvhash":"2FA7D579BF04D2A838E94D7E2D763414","privilege":8,"album_id":"971958","sqprivilege":10,"320privilege":10,"album_audio_id":32145932,"rp_type":"audio","320filesize":8844233,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":345132,"remark":"《天下无贼》片尾曲","pkg_price_320":1,"fail_process":4,"sqhash":"79A190DCD81C80F845AB3B8B1473739B","duration":222,"sqfilesize":21175421,"pay_type_sq":3,"fail_process_sq":4,"brief":"奶茶的歌里就算有伤感，也是泛着热气的。关于暗恋，知道还是不知道，我心明了。","topic_url_320":"","320hash":"11B1636B3ECDD587AD24595FBF225D7D"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":4771003,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":5113276},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"陶喆 - 暗恋","price_320":200,"extname":"mp3","hash":"1B2C7CB1A3BB84BF41582A341C70B4D9","mvhash":"1527E2F763FC9398101A593E2BFF69DB","privilege":8,"album_id":"979261","sqprivilege":10,"320privilege":10,"album_audio_id":32212276,"rp_type":"audio","320filesize":11971565,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":5225,"remark":"69乐章","pkg_price_320":1,"fail_process":4,"sqhash":"CD23908D75F41D4C84654F75A7DB955D","duration":298,"sqfilesize":31068360,"pay_type_sq":3,"fail_process_sq":4,"brief":"暗恋是创作才子们永恒的话题，在陶喆的歌里苦涩的暗恋又多了一分浪漫和洒脱。","topic_url_320":"","320hash":"B947C5978CEDF346F0FE9494BC25DCEA"},{"pay_type_320":3,"m4afilesize":0,"price_sq":0,"filesize":5166504,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":4950121},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"卢学睿 - 可不可以爱我","price_320":200,"extname":"mp3","hash":"0CB87F37FD828ECE22E72873C5EF01BA","mvhash":"7F791C3FE5F2E500424C5F656C779700","privilege":8,"album_id":"555831","sqprivilege":0,"320privilege":10,"album_audio_id":28117779,"rp_type":"audio","320filesize":12796018,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":716155,"remark":"hitto!!超人气偶像剧主题曲精选","pkg_price_320":1,"fail_process":4,"sqhash":"","duration":319,"sqfilesize":0,"pay_type_sq":0,"fail_process_sq":0,"brief":"卢学睿的歌里有孩子般的执拗，每一个暗恋中的人都会困惑，究竟要怎么做才会得到爱的回音。","topic_url_320":"","320hash":"A293B5EC455E3B030FA55C1D88E2207D"},{"pay_type_320":1,"m4afilesize":0,"price_sq":200,"filesize":4149124,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":8,"cid":32008978},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":1,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"丛铭君 - 听说","price_320":200,"extname":"mp3","hash":"D4758F2973BE3CC7E89C62F432BE9583","mvhash":"9E4C74CC22748A73CEC7044555F22825","privilege":8,"album_id":"4040155","sqprivilege":10,"320privilege":10,"album_audio_id":88246147,"rp_type":"audio","320filesize":10372746,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":28474961,"remark":"听说","pkg_price_320":1,"fail_process":4,"sqhash":"6A7656B0B3DB8806EB0DA0F75BE36B5D","duration":259,"sqfilesize":27299769,"pay_type_sq":1,"fail_process_sq":4,"brief":"丛铭君的《听说》表达了一种恍若隔世的暗恋：时隔多年，当初偷偷爱着的那个人，也渐渐成了别人口中的听说。","topic_url_320":"","320hash":"934D4C5B35AC56A7A3228F6A2279C89F"},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"filesize":3299229,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":13944677},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王俞匀 - 全世界的人都知道","price_320":200,"extname":"mp3","hash":"F1AB637FC78F89D431207631357CA12F","mvhash":"4D5D5B04AB292F26868ABA47FCA99529","privilege":8,"album_id":"720564","sqprivilege":10,"320privilege":10,"album_audio_id":29860019,"rp_type":"audio","320filesize":8244454,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","audio_id":290817,"remark":"《恶作剧之吻》电视剧插曲","pkg_price_320":1,"fail_process":4,"sqhash":"3F2E3ABB1F0653E98D9D4F875F373194","duration":206,"sqfilesize":24323033,"pay_type_sq":3,"fail_process_sq":4,"brief":"全世界都知道一厢情愿会苦恼，可他们不知道的是，不对你好会更苦恼。","topic_url_320":"","320hash":"DA3BE4EAE3F1E7B8BAEF2D78E307DDC8"}]
             * total : 30
             */

            private int timestamp;
            private int total;
            private List<InfoBean> info;

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<InfoBean> getInfo() {
                return info;
            }

            public void setInfo(List<InfoBean> info) {
                this.info = info;
            }

            public static class InfoBean {
                /**
                 * pay_type_320 : 3
                 * m4afilesize : 0
                 * price_sq : 200
                 * filesize : 4747981
                 * bitrate : 128
                 * trans_param : {"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":7214975}
                 * price : 200
                 * inlist : 1
                 * old_cpy : 0
                 * pkg_price_sq : 1
                 * pay_type : 3
                 * topic_url :
                 * fail_process_320 : 4
                 * pkg_price : 1
                 * feetype : 0
                 * filename : 周杰伦 - 不能说的秘密
                 * price_320 : 200
                 * extname : mp3
                 * hash : 6859F85541A3D58FA441D7B4B3E64F38
                 * mvhash : BC13EEFDC007D14C1FAC9A1045D57191
                 * privilege : 8
                 * album_id : 1737923
                 * sqprivilege : 10
                 * 320privilege : 10
                 * album_audio_id : 39564288
                 * rp_type : audio
                 * 320filesize : 11864815
                 * rp_publish : 1
                 * has_accompany : 1
                 * topic_url_sq :
                 * audio_id : 316495
                 * remark : 《不能说的秘密》电影插曲
                 * pkg_price_320 : 1
                 * fail_process : 4
                 * sqhash : 453A2C813A5919F81AF81AC527E44EDD
                 * duration : 296
                 * sqfilesize : 33431251
                 * pay_type_sq : 3
                 * fail_process_sq : 4
                 * brief : 说出口恐怕连守护都无法继续，只能缄默如初，在回忆里打转，永远保守这个秘密。
                 * topic_url_320 :
                 * 320hash : 43A000A7F3EB9AB91CBB59673015ECFA
                 */

                private int pay_type_320;
                private int m4afilesize;
                private int price_sq;
                private int filesize;
                private int bitrate;
                private TransParamBean trans_param;
                private int price;
                private int inlist;
                private int old_cpy;
                private int pkg_price_sq;
                private int pay_type;
                private String topic_url;
                private int fail_process_320;
                private int pkg_price;
                private int feetype;
                private String filename;
                private int price_320;
                private String extname;
                private String hash;
                private String mvhash;
                private int privilege;
                private String album_id;
                private int sqprivilege;
                @SerializedName("320privilege")
                private int _$320privilege;
                private int album_audio_id;
                private String rp_type;
                @SerializedName("320filesize")
                private int _$320filesize;
                private int rp_publish;
                private int has_accompany;
                private String topic_url_sq;
                private int audio_id;
                private String remark;
                private int pkg_price_320;
                private int fail_process;
                private String sqhash;
                private int duration;
                private int sqfilesize;
                private int pay_type_sq;
                private int fail_process_sq;
                private String brief;
                private String topic_url_320;
                @SerializedName("320hash")
                private String _$320hash;

                public int getPay_type_320() {
                    return pay_type_320;
                }

                public void setPay_type_320(int pay_type_320) {
                    this.pay_type_320 = pay_type_320;
                }

                public int getM4afilesize() {
                    return m4afilesize;
                }

                public void setM4afilesize(int m4afilesize) {
                    this.m4afilesize = m4afilesize;
                }

                public int getPrice_sq() {
                    return price_sq;
                }

                public void setPrice_sq(int price_sq) {
                    this.price_sq = price_sq;
                }

                public int getFilesize() {
                    return filesize;
                }

                public void setFilesize(int filesize) {
                    this.filesize = filesize;
                }

                public int getBitrate() {
                    return bitrate;
                }

                public void setBitrate(int bitrate) {
                    this.bitrate = bitrate;
                }

                public TransParamBean getTrans_param() {
                    return trans_param;
                }

                public void setTrans_param(TransParamBean trans_param) {
                    this.trans_param = trans_param;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getInlist() {
                    return inlist;
                }

                public void setInlist(int inlist) {
                    this.inlist = inlist;
                }

                public int getOld_cpy() {
                    return old_cpy;
                }

                public void setOld_cpy(int old_cpy) {
                    this.old_cpy = old_cpy;
                }

                public int getPkg_price_sq() {
                    return pkg_price_sq;
                }

                public void setPkg_price_sq(int pkg_price_sq) {
                    this.pkg_price_sq = pkg_price_sq;
                }

                public int getPay_type() {
                    return pay_type;
                }

                public void setPay_type(int pay_type) {
                    this.pay_type = pay_type;
                }

                public String getTopic_url() {
                    return topic_url;
                }

                public void setTopic_url(String topic_url) {
                    this.topic_url = topic_url;
                }

                public int getFail_process_320() {
                    return fail_process_320;
                }

                public void setFail_process_320(int fail_process_320) {
                    this.fail_process_320 = fail_process_320;
                }

                public int getPkg_price() {
                    return pkg_price;
                }

                public void setPkg_price(int pkg_price) {
                    this.pkg_price = pkg_price;
                }

                public int getFeetype() {
                    return feetype;
                }

                public void setFeetype(int feetype) {
                    this.feetype = feetype;
                }

                public String getFilename() {
                    return filename;
                }

                public void setFilename(String filename) {
                    this.filename = filename;
                }

                public int getPrice_320() {
                    return price_320;
                }

                public void setPrice_320(int price_320) {
                    this.price_320 = price_320;
                }

                public String getExtname() {
                    return extname;
                }

                public void setExtname(String extname) {
                    this.extname = extname;
                }

                public String getHash() {
                    return hash;
                }

                public void setHash(String hash) {
                    this.hash = hash;
                }

                public String getMvhash() {
                    return mvhash;
                }

                public void setMvhash(String mvhash) {
                    this.mvhash = mvhash;
                }

                public int getPrivilege() {
                    return privilege;
                }

                public void setPrivilege(int privilege) {
                    this.privilege = privilege;
                }

                public String getAlbum_id() {
                    return album_id;
                }

                public void setAlbum_id(String album_id) {
                    this.album_id = album_id;
                }

                public int getSqprivilege() {
                    return sqprivilege;
                }

                public void setSqprivilege(int sqprivilege) {
                    this.sqprivilege = sqprivilege;
                }

                public int get_$320privilege() {
                    return _$320privilege;
                }

                public void set_$320privilege(int _$320privilege) {
                    this._$320privilege = _$320privilege;
                }

                public int getAlbum_audio_id() {
                    return album_audio_id;
                }

                public void setAlbum_audio_id(int album_audio_id) {
                    this.album_audio_id = album_audio_id;
                }

                public String getRp_type() {
                    return rp_type;
                }

                public void setRp_type(String rp_type) {
                    this.rp_type = rp_type;
                }

                public int get_$320filesize() {
                    return _$320filesize;
                }

                public void set_$320filesize(int _$320filesize) {
                    this._$320filesize = _$320filesize;
                }

                public int getRp_publish() {
                    return rp_publish;
                }

                public void setRp_publish(int rp_publish) {
                    this.rp_publish = rp_publish;
                }

                public int getHas_accompany() {
                    return has_accompany;
                }

                public void setHas_accompany(int has_accompany) {
                    this.has_accompany = has_accompany;
                }

                public String getTopic_url_sq() {
                    return topic_url_sq;
                }

                public void setTopic_url_sq(String topic_url_sq) {
                    this.topic_url_sq = topic_url_sq;
                }

                public int getAudio_id() {
                    return audio_id;
                }

                public void setAudio_id(int audio_id) {
                    this.audio_id = audio_id;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public int getPkg_price_320() {
                    return pkg_price_320;
                }

                public void setPkg_price_320(int pkg_price_320) {
                    this.pkg_price_320 = pkg_price_320;
                }

                public int getFail_process() {
                    return fail_process;
                }

                public void setFail_process(int fail_process) {
                    this.fail_process = fail_process;
                }

                public String getSqhash() {
                    return sqhash;
                }

                public void setSqhash(String sqhash) {
                    this.sqhash = sqhash;
                }

                public int getDuration() {
                    return duration;
                }

                public void setDuration(int duration) {
                    this.duration = duration;
                }

                public int getSqfilesize() {
                    return sqfilesize;
                }

                public void setSqfilesize(int sqfilesize) {
                    this.sqfilesize = sqfilesize;
                }

                public int getPay_type_sq() {
                    return pay_type_sq;
                }

                public void setPay_type_sq(int pay_type_sq) {
                    this.pay_type_sq = pay_type_sq;
                }

                public int getFail_process_sq() {
                    return fail_process_sq;
                }

                public void setFail_process_sq(int fail_process_sq) {
                    this.fail_process_sq = fail_process_sq;
                }

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getTopic_url_320() {
                    return topic_url_320;
                }

                public void setTopic_url_320(String topic_url_320) {
                    this.topic_url_320 = topic_url_320;
                }

                public String get_$320hash() {
                    return _$320hash;
                }

                public void set_$320hash(String _$320hash) {
                    this._$320hash = _$320hash;
                }

                public static class TransParamBean {
                    /**
                     * roaming_astrict : 0
                     * pay_block_tpl : 1
                     * musicpack_advance : 0
                     * display_rate : 0
                     * display : 0
                     * cid : 7214975
                     */

                    private int roaming_astrict;
                    private int pay_block_tpl;
                    private int musicpack_advance;
                    private int display_rate;
                    private int display;
                    private int cid;

                    public int getRoaming_astrict() {
                        return roaming_astrict;
                    }

                    public void setRoaming_astrict(int roaming_astrict) {
                        this.roaming_astrict = roaming_astrict;
                    }

                    public int getPay_block_tpl() {
                        return pay_block_tpl;
                    }

                    public void setPay_block_tpl(int pay_block_tpl) {
                        this.pay_block_tpl = pay_block_tpl;
                    }

                    public int getMusicpack_advance() {
                        return musicpack_advance;
                    }

                    public void setMusicpack_advance(int musicpack_advance) {
                        this.musicpack_advance = musicpack_advance;
                    }

                    public int getDisplay_rate() {
                        return display_rate;
                    }

                    public void setDisplay_rate(int display_rate) {
                        this.display_rate = display_rate;
                    }

                    public int getDisplay() {
                        return display;
                    }

                    public void setDisplay(int display) {
                        this.display = display;
                    }

                    public int getCid() {
                        return cid;
                    }

                    public void setCid(int cid) {
                        this.cid = cid;
                    }
                }
            }
        }
    }

    public static class InfoBeanX {
        /**
         * list : {"trans_param":{"special_tag":0},"specialname":"暗恋 | 关于我爱你，都是不能说的秘密","nickname":"光荣","publishtime":"2019-02-18 00:00:00","singername":"","intro":"暗恋，不是简单的说不出口的喜欢，它更是一个人的寂寞孤单。就像在一个大大的空房子里，拼命呐喊，听到的只是自己的回声。\n\n有人说，暗恋是一个人的兵荒马乱，怕对方不知道又怕Ta知晓。坚持着一个人的单恋，还嘴硬地说着\u201c与你无关\u201d。\n\n\u2014\u2014封面图来自电影《不能说的秘密》剧照","commentcount":20,"songcount":30,"imgurl":"http://imge.kugou.com/soft/collection/{size}/20190218/20190218181731312849.jpg","collectcount":220,"suid":1295683729,"tags":[{"tagname":"流行","tagid":9},{"tagname":"国语","tagid":84},{"tagname":"伤感","tagid":578}],"playcount":459712,"specialid":604610,"slid":0}
         */

        private ListBeanXX list;

        public ListBeanXX getList() {
            return list;
        }

        public void setList(ListBeanXX list) {
            this.list = list;
        }

        public static class ListBeanXX {
            /**
             * trans_param : {"special_tag":0}
             * specialname : 暗恋 | 关于我爱你，都是不能说的秘密
             * nickname : 光荣
             * publishtime : 2019-02-18 00:00:00
             * singername :
             * intro : 暗恋，不是简单的说不出口的喜欢，它更是一个人的寂寞孤单。就像在一个大大的空房子里，拼命呐喊，听到的只是自己的回声。

             有人说，暗恋是一个人的兵荒马乱，怕对方不知道又怕Ta知晓。坚持着一个人的单恋，还嘴硬地说着“与你无关”。

             ——封面图来自电影《不能说的秘密》剧照
             * commentcount : 20
             * songcount : 30
             * imgurl : http://imge.kugou.com/soft/collection/{size}/20190218/20190218181731312849.jpg
             * collectcount : 220
             * suid : 1295683729
             * tags : [{"tagname":"流行","tagid":9},{"tagname":"国语","tagid":84},{"tagname":"伤感","tagid":578}]
             * playcount : 459712
             * specialid : 604610
             * slid : 0
             */

            private TransParamBeanX trans_param;
            private String specialname;
            private String nickname;
            private String publishtime;
            private String singername;
            private String intro;
            private int commentcount;
            private int songcount;
            private String imgurl;
            private int collectcount;
            private int suid;
            private int playcount;
            private int specialid;
            private int slid;
            private List<TagsBean> tags;

            public TransParamBeanX getTrans_param() {
                return trans_param;
            }

            public void setTrans_param(TransParamBeanX trans_param) {
                this.trans_param = trans_param;
            }

            public String getSpecialname() {
                return specialname;
            }

            public void setSpecialname(String specialname) {
                this.specialname = specialname;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public String getSingername() {
                return singername;
            }

            public void setSingername(String singername) {
                this.singername = singername;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public int getCommentcount() {
                return commentcount;
            }

            public void setCommentcount(int commentcount) {
                this.commentcount = commentcount;
            }

            public int getSongcount() {
                return songcount;
            }

            public void setSongcount(int songcount) {
                this.songcount = songcount;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public int getCollectcount() {
                return collectcount;
            }

            public void setCollectcount(int collectcount) {
                this.collectcount = collectcount;
            }

            public int getSuid() {
                return suid;
            }

            public void setSuid(int suid) {
                this.suid = suid;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public int getSpecialid() {
                return specialid;
            }

            public void setSpecialid(int specialid) {
                this.specialid = specialid;
            }

            public int getSlid() {
                return slid;
            }

            public void setSlid(int slid) {
                this.slid = slid;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TransParamBeanX {
                /**
                 * special_tag : 0
                 */

                private int special_tag;

                public int getSpecial_tag() {
                    return special_tag;
                }

                public void setSpecial_tag(int special_tag) {
                    this.special_tag = special_tag;
                }
            }

            public static class TagsBean {
                /**
                 * tagname : 流行
                 * tagid : 9
                 */

                private String tagname;
                private int tagid;

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }
            }
        }
    }
}
