package entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 对应酷狗的【新歌首发】专区
 */
public class NewMusicList {
    @Override
    public String toString() {
        return "NewMusicList{" +
                "JS_CSS_DATE=" + JS_CSS_DATE +
                ", kg_domain='" + kg_domain + '\'' +
                ", src='" + src + '\'' +
                ", fr=" + fr +
                ", ver='" + ver + '\'' +
                ", __Tpl='" + __Tpl + '\'' +
                ", data=" + data +
                ", banner=" + banner +
                '}';
    }

    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * data : [{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3397899,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58318346},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"SING女团 - 闹元宵","price_320":200,"sqfilesize":25633223,"hash":"E7DFB273EFC40E9AFEEFA7C6E7DFA8F3","audio_id":50395055,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:48:26","pkg_price_320":1,"album_audio_id":130794237,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8494284,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15329949","remark":"闹元宵","fail_process":4,"320privilege":10,"320hash":"835139F178E17CDD71093F5FFC26C8F8","sqhash":"79FBE5800EA8182D96A339836643BB48","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":212},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3508938,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58317734},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"张靓颖、蔡国庆、张杰、白雪 - 相约世界","price_320":200,"sqfilesize":21930572,"hash":"C1F8454A4F0BF02F55EEDC39110CFF9E","audio_id":50394477,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:47:14","pkg_price_320":1,"album_audio_id":130792126,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8772099,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15329615","remark":"相约世界","fail_process":4,"320privilege":10,"320hash":"CC5908C3A3F7D544409F6A564CCE720A","sqhash":"09AB8D0F84B255CA854D9E067483CD55","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":219},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":1,"filesize":5055260,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58304548},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"蔡徐坤 - 没有意外","price_320":0,"sqfilesize":25765017,"hash":"035668CC7E52709A9E844AB70BD147E9","audio_id":50393751,"privilege":0,"fail_process_sq":0,"addtime":"2019-02-18 20:02:39","pkg_price_320":0,"album_audio_id":130787844,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":12638085,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15327220","remark":"没有意外","fail_process":0,"320privilege":0,"320hash":"B0ECE10A603254001E1BD2E5FC388DBD","sqhash":"BAEE2CF9249D5E6A34AABA365C3EC16D","isfirst":0,"pay_type_sq":0,"extname":"mp3","sqprivilege":0,"topic_url_320":"","duration":315},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3556506,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58251006},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"黄子韬 - 单身","price_320":200,"sqfilesize":23557499,"hash":"4C4641423DDCDA3FDF787C44F22CF268","audio_id":50297818,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:23:45","pkg_price_320":1,"album_audio_id":130516655,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8891128,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15234545","remark":"单身","fail_process":4,"320privilege":10,"320hash":"CA95CCDE07E38224FB492B957838E571","sqhash":"8BB2620408B19633CFD7DA77FA59EE36","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":222},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3962413,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58259040},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"金玟岐 - 勇敢者的告别【朝花夕誓电影宣传推广曲】","price_320":200,"sqfilesize":23331031,"hash":"B8AB4F1D27424177B494670A01F05CB8","audio_id":50310337,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 10:00:44","pkg_price_320":1,"album_audio_id":130623946,"rp_type":"audio","mvhash":"7C41299F2C774B92FCF7C743A78B0F78","recommend_reason":"","320filesize":9905792,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15267321","remark":"《朝花夕誓》电影宣传推广曲","fail_process":4,"320privilege":10,"320hash":"50BD1143A55CD6DC3EA2809751AB770B","sqhash":"288D402B1095D4A16E85558ADE79B374","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":247},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":4801365,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58258025},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"带泪的鱼 - 回来我身旁让我爱你","price_320":200,"sqfilesize":35959739,"hash":"02A5E75604F1001EAE32D41118FAC630","audio_id":50306234,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:25:06","pkg_price_320":1,"album_audio_id":130620139,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":12003011,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15265858","remark":"回来我身旁让我爱你","fail_process":4,"320privilege":10,"320hash":"A670195E9E9941D3EE06FCF47DFD7E0D","sqhash":"E186CF7B10EFE27C8F693758A9760D38","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":300},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3540158,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58258084},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"宋孟君 - 回忆有毒","price_320":200,"sqfilesize":22515835,"hash":"F8066025FA74624F74F7B90ECA788CB5","audio_id":50306799,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:24:30","pkg_price_320":1,"album_audio_id":130619023,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8850329,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15265424","remark":"回忆有毒","fail_process":4,"320privilege":10,"320hash":"B13930ABDB3F24EB80EF46D87D53AC87","sqhash":"D365B527E4B2910FFEC1ECE458A5E30B","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":221},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3981107,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58258685},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"周笔畅 - 只如初见 (Live)","price_320":200,"sqfilesize":24600792,"hash":"35BE3822940C33F514730F5C7A81B9C6","audio_id":50307452,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-17 00:38:10","pkg_price_320":1,"album_audio_id":130538686,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":9952499,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15240922","remark":"经典咏流传第二季 第3期","fail_process":4,"320privilege":10,"320hash":"64C4B2767317E36BB5BF7DC31A9B3C84","sqhash":"9D47C2834E72FF29BE5626AE2C41AFF0","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":248},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":4641062,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58255885},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"六哲、章古 - 0759","price_320":200,"sqfilesize":32109589,"hash":"B149D08772434CA7CA1F78794BED9D69","audio_id":50303791,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-17 00:37:46","pkg_price_320":1,"album_audio_id":130558215,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":11602591,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15248443","remark":"0759","fail_process":4,"320privilege":10,"320hash":"341B6BEC1333B38808F2CA67188ED790","sqhash":"B1955EA9CE7A52A25C12098B9A457543","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":290},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3487623,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58315507},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"电流妹 - 粉色少女","price_320":200,"sqfilesize":28983996,"hash":"A4F015F1C24566AA80315329FAAE7329","audio_id":50393304,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:53:05","pkg_price_320":1,"album_audio_id":130790610,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8718903,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15329008","remark":"粉色少女","fail_process":4,"320privilege":10,"320hash":"9A1F3CD7AFA0323974DB1405E74815C3","sqhash":"21752AF956D27A102384C28B0ACF2A6A","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":217},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3896805,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58308098},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"高进 - 失控【失控超级犯罪网剧同名主题曲】","price_320":200,"sqfilesize":26777925,"hash":"D047095B0A3A0BB3D73E175D580F467F","audio_id":50391159,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:50:43","pkg_price_320":1,"album_audio_id":130775436,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":9741755,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15323726","remark":"《失控》超级犯罪网剧同名主题曲","fail_process":4,"320privilege":10,"320hash":"B64A765BBAA5BD159CDF164C2D592D72","sqhash":"AF6F789A8C9228EC24B9CAC65E281FD6","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":243},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":1,"filesize":4225474,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58304437},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":3,"topic_url":"","fail_process_320":0,"pkg_price":1,"feetype":0,"filename":"东方晴儿 - 格局","price_320":0,"sqfilesize":0,"hash":"DD780F72176CE5C8A27B6A5ADD82EEAB","audio_id":50385571,"privilege":8,"fail_process_sq":0,"addtime":"2019-02-18 11:12:04","pkg_price_320":0,"album_audio_id":130756479,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":0,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15317932","remark":"格局","fail_process":4,"320privilege":0,"320hash":"","sqhash":"","isfirst":0,"pay_type_sq":0,"extname":"mp3","sqprivilege":0,"topic_url_320":"","duration":264},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3842051,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":57522423},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"洛天依 - 你的荣光","price_320":200,"sqfilesize":28234021,"hash":"7B6DA952ADA527BFAE00905684BCA46F","audio_id":49740857,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:27:51","pkg_price_320":1,"album_audio_id":129652532,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":9604873,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"14914054","remark":"你的荣光","fail_process":4,"320privilege":10,"320hash":"E86BCA9A2654243ABCF2AC52ABF3B8EB","sqhash":"EC8B079E4CCFE90ED8AB90616F6C9025","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":240},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":4736807,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":1,"display_rate":0,"cid":58258348,"display":0,"hash_offset":{"offset_hash":"9327A2A180D600C1FCD817B732B7DEFC","start_byte":0,"end_ms":197300,"file_type":0,"start_ms":137300,"end_byte":3157798}},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"Kristian Kostov - 天真有邪 (Live)","price_320":200,"sqfilesize":28500084,"hash":"CC42227AA05650AECCD84150ABBF0E04","audio_id":50306616,"privilege":10,"fail_process_sq":4,"addtime":"2019-02-16 00:54:17","pkg_price_320":1,"album_audio_id":130537337,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":11841767,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15238828","remark":"歌手第三季 第6期","fail_process":4,"320privilege":10,"320hash":"466AF527675611C66689C931657C8FEF","sqhash":"4878669CB409F660FBFF273083B559AA","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":296},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":4280623,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58227412},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"容祖儿 - 戎对妆【独孤皇后电视剧主题曲】","price_320":200,"sqfilesize":31499158,"hash":"D04A72DB063153B2CC2AB7C7E2265459","audio_id":50260447,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-15 10:41:49","pkg_price_320":1,"album_audio_id":130421297,"rp_type":"audio","mvhash":"20CA7C512D7BD91BAA0F8C426F7BFEFE","recommend_reason":"","320filesize":10701165,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15197564","remark":"《独孤皇后》电视剧主题曲","fail_process":4,"320privilege":10,"320hash":"2FC65545C7F468B6097F8EE4375D89B4","sqhash":"9047EA8760E0DFC0C225B4292D5B481D","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":267},{"pay_type_320":0,"m4afilesize":0,"price_sq":0,"first":1,"filesize":4651093,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58258946},"price":0,"inlist":1,"old_cpy":1,"pkg_price_sq":0,"pay_type":0,"topic_url":"","fail_process_320":0,"pkg_price":0,"feetype":0,"filename":"望海高歌 - 梦断沈园","price_320":0,"sqfilesize":33214160,"hash":"3717A595CEEEB26697E264E0DE36C0D5","audio_id":50310231,"privilege":0,"fail_process_sq":0,"addtime":"2019-02-16 00:56:50","pkg_price_320":0,"album_audio_id":130542776,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":11627668,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15243952","remark":"梦断沈园","fail_process":0,"320privilege":0,"320hash":"7A78B29CC820C072C0E30E958166DBAE","sqhash":"A9465E4599C0CBB7827B7A8349CD0AC1","isfirst":0,"pay_type_sq":0,"extname":"mp3","sqprivilege":0,"topic_url_320":"","duration":290},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3317804,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58227016},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"威仔、阿夏 - 再也不会打扰你","price_320":200,"sqfilesize":25254237,"hash":"195D072592805531EC4D25D514784D28","audio_id":50261576,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-15 01:55:19","pkg_price_320":1,"album_audio_id":130423457,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8294444,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15198565","remark":"再也不会打扰你","fail_process":4,"320privilege":10,"320hash":"5C0B70A0E3A79FEEB692D47340116B25","sqhash":"19F8A0589FD70A84E66FF48B49641BC0","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":207},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3536934,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58174727},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"郁可唯 - 天高【独孤皇后电视剧片插曲】","price_320":200,"sqfilesize":23452130,"hash":"9B68B12ABDAD9EFE9F625FECABFF89CB","audio_id":50201368,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-14 10:00:42","pkg_price_320":1,"album_audio_id":130292373,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8842090,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15138633","remark":"《独孤皇后》电视剧片插曲","fail_process":4,"320privilege":10,"320hash":"2B2C72146F49DE145FF8F6726ED3937F","sqhash":"64D933F460CF0B54300B0741AC2AAEA8","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":221},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":5334457,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58304410},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"雨霖枫、蒙面哥 - 爱上一个已婚的人","price_320":200,"sqfilesize":37566311,"hash":"B90A31A4416B6160A0884246ECB10F42","audio_id":50385240,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 11:55:51","pkg_price_320":1,"album_audio_id":130768161,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":13336076,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15321600","remark":"爱上一个已婚的人","fail_process":4,"320privilege":10,"320hash":"9B57BC35065D76CFFC26E1A0C6C2CDC1","sqhash":"2951C636C1403A026A65D1F4CC51DB6F","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":333},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3589182,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58314752},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王馨 - 报答","price_320":200,"sqfilesize":23550550,"hash":"250A782447D388E6A853AA4A35404BA8","audio_id":50392925,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:58:27","pkg_price_320":1,"album_audio_id":130785216,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8972705,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15326887","remark":"报答","fail_process":4,"320privilege":10,"320hash":"89F6B5BF6B4890ECE01C59B93067B06D","sqhash":"7167690EE6CF44C2539AF8E01C769915","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":224},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3265559,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58312144},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"彭筝 - 爱的休止符","price_320":200,"sqfilesize":22304401,"hash":"3F9670BB106A450885A149AE63A57B22","audio_id":50392848,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:57:39","pkg_price_320":1,"album_audio_id":130782705,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8163831,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15326065","remark":"爱的休止符","fail_process":4,"320privilege":10,"320hash":"2AD7FE5A86CD96A5B8F9F074BB0B39DD","sqhash":"3CB695C1325B26DC7F78DC8AE2D523F9","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":204},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":4415782,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58308373},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"尼格买提·热合曼 - 时光","price_320":200,"sqfilesize":29696582,"hash":"F2AE9B3DAF821281A06DF62EA4030EE2","audio_id":50391404,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-19 01:55:35","pkg_price_320":1,"album_audio_id":130790438,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":11039391,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15328925","remark":"时光","fail_process":4,"320privilege":10,"320hash":"6454F5BEDE9CE00178EA4830BDE5DE46","sqhash":"096C8962AFD89D935435E084C0E1D948","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":275},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3576226,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58258558},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"Legal High 嗨战队 - 心星","price_320":200,"sqfilesize":30921403,"hash":"789F8217EBE620B9545D8FCF71F24327","audio_id":50307851,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:30:39","pkg_price_320":1,"album_audio_id":130581224,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8939699,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15254368","remark":"心星","fail_process":4,"320privilege":10,"320hash":"032E9867431D401F124B117E89210995","sqhash":"92153F14CB0609A731B80E1D9AA73888","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":223},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3030372,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58297672},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"杜海涛 - 更上一层楼【更上一层楼综艺主题曲】","price_320":200,"sqfilesize":25352315,"hash":"7CC59E8850FEB35219B17BCCA07D7A64","audio_id":50370408,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-18 01:31:49","pkg_price_320":1,"album_audio_id":130725608,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":7575678,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15306578","remark":"《更上一层楼》综艺主题曲","fail_process":4,"320privilege":10,"320hash":"90C899DC71438D80D7E0EB1BD940D51C","sqhash":"73C3A920619FACF3F5625FCD9E416D14","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":189},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3984031,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58206249},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"台风少年团 - 姐姐恋爱吧","price_320":200,"sqfilesize":35015246,"hash":"54AD8F083578F7432F8250ED1C120B49","audio_id":50221699,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-14 10:05:32","pkg_price_320":1,"album_audio_id":130373246,"rp_type":"audio","mvhash":"D09E9443BB58C9C6EE740EE547D885F2","recommend_reason":"","320filesize":9959966,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15182784","remark":"V5","fail_process":4,"320privilege":10,"320hash":"CF7C77C60FA8C83C5D179522B3572316","sqhash":"4DCFEE834B86C18772EFDF4531A07278","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":248},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3688355,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58205173},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"ONER - for","price_320":200,"sqfilesize":25121401,"hash":"BC6B135635CF8DB67C8DCF0803367B62","audio_id":50217480,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-14 00:55:46","pkg_price_320":1,"album_audio_id":130354719,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":9220463,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15163248","remark":"for","fail_process":4,"320privilege":10,"320hash":"92BA409E3177CEBA788570064A10BC4F","sqhash":"A73AE32EA15DDD114EE7723DD67D240E","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":230},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3553115,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":57474510},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"虎二 - 刺青","price_320":200,"sqfilesize":25702380,"hash":"256EE9A42CC723DC397CC5DDB356AB43","audio_id":49693633,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-14 00:56:30","pkg_price_320":1,"album_audio_id":129482878,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":8882721,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"14789095","remark":"刺青","fail_process":4,"320privilege":10,"320hash":"54B00387DA17D9F1A83CDC8D07E5EB27","sqhash":"D4A78F658D85C63EB364BCF665CC739C","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":222},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3190027,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":1,"display_rate":0,"cid":58258780,"display":0,"hash_offset":{"offset_hash":"AD7A33B5860BB8C2626D007B9651CD98","start_byte":0,"end_ms":30000,"file_type":0,"start_ms":0,"end_byte":481233}},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"华晨宇、张明敏 - 我的中国心 (Live)","price_320":200,"sqfilesize":21455502,"hash":"6AD333195E6DD6CF031BD872CA9574BD","audio_id":50309430,"privilege":10,"fail_process_sq":4,"addtime":"2019-02-16 00:27:22","pkg_price_320":1,"album_audio_id":130541522,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":7974824,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15243554","remark":"王牌对王牌第四季 第3期","fail_process":4,"320privilege":10,"320hash":"3F996776C25D1BCFA12BBC68575C0892","sqhash":"7A5BCB907568472789BC83CFF553A934","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":199},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3201193,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58212093},"price":200,"inlist":1,"old_cpy":0,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"Dough-boy、王嘉尔 - MK Circus","price_320":200,"sqfilesize":20809074,"hash":"96A7BEF28104D3BF80C6D0FD7688342A","audio_id":50250373,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-15 01:54:05","pkg_price_320":1,"album_audio_id":130416467,"rp_type":"audio","mvhash":"3AA404974BF50BA3EB96E08D7A3551B7","recommend_reason":"","320filesize":8002917,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15195344","remark":"MK Circus","fail_process":4,"320privilege":10,"320hash":"54B765F7470FE417C8D330CAD5705AFE","sqhash":"87851E573B300EBA150EBD79C85CA962","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":200},{"pay_type_320":3,"m4afilesize":0,"price_sq":200,"first":1,"filesize":3618224,"bitrate":128,"trans_param":{"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58206831},"price":200,"inlist":1,"old_cpy":1,"pkg_price_sq":1,"pay_type":3,"topic_url":"","fail_process_320":4,"pkg_price":1,"feetype":0,"filename":"王北车 - 忽然之间","price_320":200,"sqfilesize":24328917,"hash":"24C44DBE3EBCC02F6A6145FA55731813","audio_id":50231188,"privilege":8,"fail_process_sq":4,"addtime":"2019-02-14 00:54:11","pkg_price_320":1,"album_audio_id":130382944,"rp_type":"audio","mvhash":"","recommend_reason":"","320filesize":9045296,"rp_publish":1,"has_accompany":1,"topic_url_sq":"","album_id":"15185290","remark":"忽然之间","fail_process":4,"320privilege":10,"320hash":"C6B9C053AFBD0F45E82163EA2FC4A0D3","sqhash":"8B7CA7711E081D74184EC24CC7D1D5C5","isfirst":0,"pay_type_sq":3,"extname":"mp3","sqprivilege":10,"topic_url_320":"","duration":226}]
     * banner : [{"imgurl":"http://imge.kugou.com/mobilebanner/20190211/20190211230637695382.jpg","title":"网络专区","id":10341,"type":4,"online":1550571141,"extra":{"tourl":"https://m2.service.kugou.com/yueku/category/html/index.html?areaid=19"}},{"imgurl":"http://imge.kugou.com/mobilebanner/20190218/20190218181910924831.jpg","title":"轻音乐专区","id":10355,"type":4,"online":1550485172,"extra":{"tourl":"http://m.www2.kugou.com/yueku/category/html/index.html?areaid=14"}},{"imgurl":"http://imge.kugou.com/mobilebanner/20190218/20190218181941949722.jpg","title":"情歌专区","id":10357,"type":4,"online":1550485241,"extra":{"tourl":"https://m2.service.kugou.com/yueku/category/html/index.html?areaid=15"}},{"imgurl":"http://imge.kugou.com/mobilebanner/20190218/20190218182051852264.jpg","title":"蘑菇动漫专区","id":10359,"type":4,"online":1550485331,"extra":{"tourl":"http://m.www2.kugou.com/yueku/category/html/index.html?areaid=3"}}]
     * __Tpl : index/index.html
     */

    private int JS_CSS_DATE;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private String __Tpl;
    private List<DataBean> data;
    private List<BannerBean> banner;

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

    public String get__Tpl() {
        return __Tpl;
    }

    public void set__Tpl(String __Tpl) {
        this.__Tpl = __Tpl;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<BannerBean> getBanner() {
        return banner;
    }

    public void setBanner(List<BannerBean> banner) {
        this.banner = banner;
    }

    public static class DataBean {
        /**
         * pay_type_320 : 3
         * m4afilesize : 0
         * price_sq : 200
         * first : 1
         * filesize : 3397899
         * bitrate : 128
         * trans_param : {"roaming_astrict":0,"pay_block_tpl":1,"musicpack_advance":0,"display_rate":0,"display":0,"cid":58318346}
         * price : 200
         * inlist : 1
         * old_cpy : 1
         * pkg_price_sq : 1
         * pay_type : 3
         * topic_url :
         * fail_process_320 : 4
         * pkg_price : 1
         * feetype : 0
         * filename : SING女团 - 闹元宵
         * price_320 : 200
         * sqfilesize : 25633223
         * hash : E7DFB273EFC40E9AFEEFA7C6E7DFA8F3
         * audio_id : 50395055
         * privilege : 8
         * fail_process_sq : 4
         * addtime : 2019-02-19 01:48:26
         * pkg_price_320 : 1
         * album_audio_id : 130794237
         * rp_type : audio
         * mvhash :
         * recommend_reason :
         * 320filesize : 8494284
         * rp_publish : 1
         * has_accompany : 1
         * topic_url_sq :
         * album_id : 15329949
         * remark : 闹元宵
         * fail_process : 4
         * 320privilege : 10
         * 320hash : 835139F178E17CDD71093F5FFC26C8F8
         * sqhash : 79FBE5800EA8182D96A339836643BB48
         * isfirst : 0
         * pay_type_sq : 3
         * extname : mp3
         * sqprivilege : 10
         * topic_url_320 :
         * duration : 212
         */

        private int pay_type_320;
        private int m4afilesize;
        private int price_sq;
        private int first;
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
        private int sqfilesize;
        private String hash;
        private int audio_id;
        private int privilege;
        private int fail_process_sq;
        private String addtime;
        private int pkg_price_320;
        private int album_audio_id;
        private String rp_type;
        private String mvhash;
        private String recommend_reason;
        @SerializedName("320filesize")
        private int _$320filesize;
        private int rp_publish;
        private int has_accompany;
        private String topic_url_sq;
        private String album_id;
        private String remark;
        private int fail_process;
        @SerializedName("320privilege")
        private int _$320privilege;
        @SerializedName("320hash")
        private String _$320hash;
        private String sqhash;
        private int isfirst;
        private int pay_type_sq;
        private String extname;
        private int sqprivilege;
        private String topic_url_320;
        private int duration;

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

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
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

        public int getSqfilesize() {
            return sqfilesize;
        }

        public void setSqfilesize(int sqfilesize) {
            this.sqfilesize = sqfilesize;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public int getAudio_id() {
            return audio_id;
        }

        public void setAudio_id(int audio_id) {
            this.audio_id = audio_id;
        }

        public int getPrivilege() {
            return privilege;
        }

        public void setPrivilege(int privilege) {
            this.privilege = privilege;
        }

        public int getFail_process_sq() {
            return fail_process_sq;
        }

        public void setFail_process_sq(int fail_process_sq) {
            this.fail_process_sq = fail_process_sq;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public int getPkg_price_320() {
            return pkg_price_320;
        }

        public void setPkg_price_320(int pkg_price_320) {
            this.pkg_price_320 = pkg_price_320;
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

        public String getMvhash() {
            return mvhash;
        }

        public void setMvhash(String mvhash) {
            this.mvhash = mvhash;
        }

        public String getRecommend_reason() {
            return recommend_reason;
        }

        public void setRecommend_reason(String recommend_reason) {
            this.recommend_reason = recommend_reason;
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

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getFail_process() {
            return fail_process;
        }

        public void setFail_process(int fail_process) {
            this.fail_process = fail_process;
        }

        public int get_$320privilege() {
            return _$320privilege;
        }

        public void set_$320privilege(int _$320privilege) {
            this._$320privilege = _$320privilege;
        }

        public String get_$320hash() {
            return _$320hash;
        }

        public void set_$320hash(String _$320hash) {
            this._$320hash = _$320hash;
        }

        public String getSqhash() {
            return sqhash;
        }

        public void setSqhash(String sqhash) {
            this.sqhash = sqhash;
        }

        public int getIsfirst() {
            return isfirst;
        }

        public void setIsfirst(int isfirst) {
            this.isfirst = isfirst;
        }

        public int getPay_type_sq() {
            return pay_type_sq;
        }

        public void setPay_type_sq(int pay_type_sq) {
            this.pay_type_sq = pay_type_sq;
        }

        public String getExtname() {
            return extname;
        }

        public void setExtname(String extname) {
            this.extname = extname;
        }

        public int getSqprivilege() {
            return sqprivilege;
        }

        public void setSqprivilege(int sqprivilege) {
            this.sqprivilege = sqprivilege;
        }

        public String getTopic_url_320() {
            return topic_url_320;
        }

        public void setTopic_url_320(String topic_url_320) {
            this.topic_url_320 = topic_url_320;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public static class TransParamBean {
            /**
             * roaming_astrict : 0
             * pay_block_tpl : 1
             * musicpack_advance : 0
             * display_rate : 0
             * display : 0
             * cid : 58318346
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

    public static class BannerBean {
        /**
         * imgurl : http://imge.kugou.com/mobilebanner/20190211/20190211230637695382.jpg
         * title : 网络专区
         * id : 10341
         * type : 4
         * online : 1550571141
         * extra : {"tourl":"https://m2.service.kugou.com/yueku/category/html/index.html?areaid=19"}
         */

        private String imgurl;
        private String title;
        private int id;
        private int type;
        private int online;
        private ExtraBean extra;

        public String getImgurl() {
            return imgurl;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getOnline() {
            return online;
        }

        public void setOnline(int online) {
            this.online = online;
        }

        public ExtraBean getExtra() {
            return extra;
        }

        public void setExtra(ExtraBean extra) {
            this.extra = extra;
        }

        public static class ExtraBean {
            /**
             * tourl : https://m2.service.kugou.com/yueku/category/html/index.html?areaid=19
             */
            private String tourl;

            public String getTourl() {
                return tourl;
            }

            public void setTourl(String tourl) {
                this.tourl = tourl;
            }
        }
    }
}
