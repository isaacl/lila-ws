package lila.ws

trait StringValue extends Any {
  def value: String
  override def toString = value
}

case class User(id: User.ID) extends AnyVal

object User {
  type ID = String
}

case class Game(id: Game.ID) extends AnyVal

object Game {
  type ID = String
}

case class Sri(value: String) extends AnyVal with StringValue

object Sri {
  type Str = String
}

case class Simul(id: Simul.ID) extends AnyVal

object Simul {
  type ID = String
}

case class Flag private (value: String) extends AnyVal with StringValue

object Flag {
  def make(value: String) = value match {
    case "simul" | "tournament" => Some(Flag(value))
    case _ => None
  }
}

case class Path(value: String) extends AnyVal with StringValue

case class ChapterId(value: String) extends AnyVal with StringValue

case class JsonString(value: String) extends AnyVal with StringValue
