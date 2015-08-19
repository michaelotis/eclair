// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package lightning


import com.trueaccord.scalapb.Descriptors

@SerialVersionUID(0L)
final case class close_channel_complete(
    sig: lightning.signature
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[close_channel_complete] with com.trueaccord.lenses.Updatable[close_channel_complete] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      __size += 1 + com.google.protobuf.CodedOutputStream.computeRawVarint32Size(sig.serializedSize) + sig.serializedSize
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      output.writeTag(1, 2)
      output.writeRawVarint32(sig.serializedSize)
      sig.writeTo(output)
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): lightning.close_channel_complete = {
      var __sig = this.sig
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __sig = com.trueaccord.scalapb.LiteParser.readMessage(__input, __sig)
          case tag => __input.skipField(tag)
        }
      }
      lightning.close_channel_complete(
          sig = __sig
      )
    }
    def withSig(__v: lightning.signature): close_channel_complete = copy(sig = __v)
    def getField(__field: Descriptors.FieldDescriptor): Any = {
      __field.number match {
        case 1 => sig
      }
    }
    def companion = lightning.close_channel_complete
}

object close_channel_complete extends com.trueaccord.scalapb.GeneratedMessageCompanion[close_channel_complete]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[close_channel_complete]  = this
  def fromFieldsMap(fieldsMap: Map[Int, Any]): lightning.close_channel_complete = lightning.close_channel_complete(
    sig = fieldsMap(1).asInstanceOf[lightning.signature]
  )
  lazy val descriptor = new Descriptors.MessageDescriptor("close_channel_complete", this,
    None, m = Seq(),
    e = Seq(),
    f = lightning.InternalFields_srcMainProtobufLightningProto.internalFieldsFor("lightning.close_channel_complete"))
  lazy val defaultInstance = lightning.close_channel_complete(
    sig = lightning.signature.defaultInstance
  )
  implicit class close_channel_completeLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, close_channel_complete]) extends com.trueaccord.lenses.ObjectLens[UpperPB, close_channel_complete](_l) {
    def sig: com.trueaccord.lenses.Lens[UpperPB, lightning.signature] = field(_.sig)((c_, f_) => c_.copy(sig = f_))
  }
  final val SIG_FIELD_NUMBER = 1
}
